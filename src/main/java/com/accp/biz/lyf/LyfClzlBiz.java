package com.accp.biz.lyf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lyf.LyfClzlDao;
import com.accp.pojo.Consumercar;
import com.accp.pojo.Consumerinfo;
import com.accp.vo.lyf.LyfClzlVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LyfClzlBiz {
	@Autowired
	private LyfClzlDao lyfclzldao;
	public List<LyfClzlVo> clzl(String userid) {
		return lyfclzldao.clzl(userid);
	}
	public int addkehuche(Consumercar kehuche) {
		return lyfclzldao.insert(kehuche);
	}
	public int xiugaikehuche(Consumercar kehuche) {
		return lyfclzldao.updateById(kehuche);
	}
	public int shanchukehu(String userid) {
		return lyfclzldao.deleteById(userid);
	}
	public int shanchukehuche(Integer userid) {
		return lyfclzldao.deleteById(userid);
	}
	public List<LyfClzlVo> chelianziliao() {
		return lyfclzldao.chelianziliao();
	}
	public List<LyfClzlVo> chachepai(String chepai) {
		return lyfclzldao.chachepai(chepai);
	}
}
