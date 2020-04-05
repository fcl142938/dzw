package com.accp.vo.fcl;

public class FclShowVo {
		private Double countprice;
		private Integer jcar;
		private Integer overNumber;
		private Integer returnNumber;
		public Double getCountprice() {
			return countprice;
		}
		public void setCountprice(Double countprice) {
			this.countprice = countprice;
		}
		public Integer getJcar() {
			return jcar;
		}
		public void setJcar(Integer jcar) {
			this.jcar = jcar;
		}
		public Integer getOverNumber() {
			return overNumber;
		}
		public void setOverNumber(Integer overNumber) {
			this.overNumber = overNumber;
		}
		public Integer getReturnNumber() {
			return returnNumber;
		}
		public void setReturnNumber(Integer returnNumber) {
			this.returnNumber = returnNumber;
		}
		public FclShowVo(Double countprice, Integer jcar, Integer overNumber, Integer returnNumber) {
			super();
			this.countprice = countprice;
			this.jcar = jcar;
			this.overNumber = overNumber;
			this.returnNumber = returnNumber;
		}
		public FclShowVo() {
			// TODO Auto-generated constructor stub
		}
}
