package com.accp.vo.lyf;

import java.util.Date;

import com.accp.pojo.Motorcycle;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class LyfClzlVo {
	@TableId(value = "consumerid",type = IdType.AUTO)
    private String consumerid;

    private Integer userid;

    private Integer motorcycleid;

    private String carnumber;

    private String drivername;

    private String driverphone;

    private Date driverbrithday;

    private Date driverdate;

    private Long carcourse;

    private Date buycar;
    
    private Motorcycle motorcycle;

	public String getConsumerid() {
		return consumerid;
	}

	public void setConsumerid(String consumerid) {
		this.consumerid = consumerid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getMotorcycleid() {
		return motorcycleid;
	}

	public void setMotorcycleid(Integer motorcycleid) {
		this.motorcycleid = motorcycleid;
	}

	public String getCarnumber() {
		return carnumber;
	}

	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}

	public String getDrivername() {
		return drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}

	public String getDriverphone() {
		return driverphone;
	}

	public void setDriverphone(String driverphone) {
		this.driverphone = driverphone;
	}

	public Date getDriverbrithday() {
		return driverbrithday;
	}

	public void setDriverbrithday(Date driverbrithday) {
		this.driverbrithday = driverbrithday;
	}

	public Date getDriverdate() {
		return driverdate;
	}

	public void setDriverdate(Date driverdate) {
		this.driverdate = driverdate;
	}

	public Long getCarcourse() {
		return carcourse;
	}

	public void setCarcourse(Long carcourse) {
		this.carcourse = carcourse;
	}

	public Date getBuycar() {
		return buycar;
	}

	public void setBuycar(Date buycar) {
		this.buycar = buycar;
	}

	public Motorcycle getMotorcycle() {
		return motorcycle;
	}

	public void setMotorcycle(Motorcycle motorcycle) {
		this.motorcycle = motorcycle;
	}

	public LyfClzlVo(String consumerid, Integer userid, Integer motorcycleid, String carnumber, String drivername,
			String driverphone, Date driverbrithday, Date driverdate, Long carcourse, Date buycar,
			Motorcycle motorcycle) {
		super();
		this.consumerid = consumerid;
		this.userid = userid;
		this.motorcycleid = motorcycleid;
		this.carnumber = carnumber;
		this.drivername = drivername;
		this.driverphone = driverphone;
		this.driverbrithday = driverbrithday;
		this.driverdate = driverdate;
		this.carcourse = carcourse;
		this.buycar = buycar;
		this.motorcycle = motorcycle;
	}

	public LyfClzlVo() {
		super();
	}
    
}
