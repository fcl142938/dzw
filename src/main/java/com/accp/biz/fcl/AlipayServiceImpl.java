package com.accp.biz.fcl;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.accp.clg.AlipayConfig;
import com.accp.clg.AlipayService;
import com.accp.dao.fcl.FclMemberDao;
import com.accp.dao.fcl.FclMemberinfoDao;
import com.accp.dao.fcl.FclServicingmainDao;
import com.accp.dao.tyh.tyhISettlementCenterDAO;
import com.accp.pojo.Member;
import com.accp.pojo.Memberinfo;
import com.accp.pojo.Servicingmain;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;

import com.alipay.api.request.AlipayTradePagePayRequest;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AlipayServiceImpl implements AlipayService {
		
	@Resource
	FclServicingmainDao dao;
	
	@Resource
	tyhISettlementCenterDAO tdao;
	
	@Resource
	FclMemberDao mdao;
	
	@Resource
	FclMemberinfoDao idao;


    @Override
    public String aliPay(HttpServletResponse response, HttpServletRequest request,String smid,Integer state) throws IOException {
        //response.setContentType("text/html;charset=utf-8");

        //PrintWriter out = response.getWriter();
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        //设置请求参数
        AlipayTradePagePayRequest aliPayRequest = new AlipayTradePagePayRequest();
        aliPayRequest.setReturnUrl(AlipayConfig.return_url);
        aliPayRequest.setNotifyUrl(AlipayConfig.notify_url);

        //商户订单号，后台可以写一个工具类生成一个订单号，必填//StringUtils.getStr()
        
        String  order_number ="";
        //付款金额，从前台获取，必填
        String total_amount ="";
        
        String subject ="";
        //结算
        if(state==0) {
        	Servicingmain ser=dao.selectById(smid);
        	total_amount =ser.getCountprice()+"";
        	 order_number =ser.getSmid();
        	 tdao.tyhupdateBySettlementCenter(smid);
        	 subject= new String("德召文结算");
        }else {
        	//修改主表
        	order_number=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+smid;
        	total_amount=state+"";
        	subject="会员充值";
        	Member mber=mdao.selectById(smid);
        	//System.out.println(smid);
        	Double price=mber.getMoney()+state;
        	mber.setCountmoney(mber.getCountmoney()+state);
        	mber.setMoney(price);
        	mber.setMemberintegrate(mber.getMemberintegrate()+state/10);
        	mber.setCountintegrate(mber.getCountintegrate()+state/10);
        	mdao.updateById(mber);
        	Integer id=Integer.parseInt(smid);
        	//新增记录	
        	idao.insert(new Memberinfo(id,new Date(),state/10.0, mber.getCountintegrate()+state/10.0, price,state+0.0, 0, "0"));
        	
        }
       
        //订单名称，必填
      
        aliPayRequest.setBizContent("{\"out_trade_no\":\"" + order_number + "\","
                + "\"total_amount\":\"" + total_amount + "\","
                + "\"subject\":\"" + subject + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        //请求
        String result = null;
        try {
            result = alipayClient.pageExecute(aliPayRequest).getBody();
        } catch (AlipayApiException e) {	
            e.printStackTrace();
        }
       // out.print("shab");
        //输出
        //System.out.println(result);
     //   out.println(result);
       return result;
       // log.info("返回结果={}",result);

    }
}