package com.accp.dao.lyf;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Consumercar;
import com.accp.vo.lyf.LyfClzlVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface LyfClzlDao extends BaseMapper<Consumercar>{
	List<LyfClzlVo> clzl(@Param("userid") String userid);
	List<LyfClzlVo> chelianziliao();
	List<LyfClzlVo> chachepai(@Param("chepai") String chepai);
}
