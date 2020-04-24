package com.accp.action.fcl;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.clg.AlipayService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    AlipayService alipayService;


    @RequestMapping("/pay/{smid}")
    public void payMent(HttpServletResponse response, HttpServletRequest request,@PathVariable String smid) {
        try {
        	System.out.println(smid);
            alipayService.aliPay(response,request,smid,0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
