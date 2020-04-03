package com.accp.biz.fcl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.dao.fcl.FclTypeDao;
import com.accp.dao.fcl.FclTypeinfoDao;
import com.accp.pojo.Type;
import com.accp.pojo.Typeinfo;
import com.accp.vo.fcl.FclTypeVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class FclTypeBiz {

	@Resource
	private FclTypeDao dao;

	@Resource
	private FclTypeinfoDao tdao;

	//节点树
	public List<FclTypeVo> queryType() {
		List<FclTypeVo> list = new ArrayList<FclTypeVo>(0);
		// 生成一级节点
		FclTypeVo vo= new FclTypeVo(0, "全部", -1, null);
		list.add(queryTree(vo));
		return list;
	}

	/**
	 * 
	 * 生成子节点
	 * @param vo
	 * @return
	 */
	private FclTypeVo queryTree(FclTypeVo vo) {
		List<Type> list = dao.selectList(new QueryWrapper<Type>().eq("typeparent", vo.getTypeid()));
		// 有子节点
		if (list != null && list.size() != 0) {
			List<FclTypeVo> listvo = new ArrayList<FclTypeVo>(0);
			list.forEach(temp -> {
				FclTypeVo tv = new FclTypeVo(temp.getTypeid(), temp.getTypename(), temp.getTypeparent(), null);
				listvo.add(tv);
			});
			vo.setList(listvo);
			listvo.forEach(temp -> {
				queryTree(temp);
			});
		}
		return vo;
	}
	
	/**
	 * 查询类型下的项目
	 * @param currentPage
	 * @param pageSize
	 * @param parentid
	 * @return
	 */
	public  PageInfo<Typeinfo>  queryPage(Integer currentPage,Integer pageSize,Integer parentid){
		//查询子类型id
		List<Integer> list=new ArrayList<Integer>();
		queryList(list,parentid);
		PageHelper.startPage(currentPage, pageSize);
		return new PageInfo<Typeinfo>(tdao.selectList(new QueryWrapper<Typeinfo>().in("typeid",list)));
	}
	
	private  void queryList(List<Integer> list,Integer parentid) {
		list.add(parentid);
		List<Type> ty=dao.selectList(new QueryWrapper<Type>().eq("typeparent", parentid));
		if(ty!=null) {
			ty.stream().map(Type::getTypeid).collect(Collectors.toList()).forEach(temp->{				
				queryList(list,temp);
			});
		}
		return ;
	}
}
