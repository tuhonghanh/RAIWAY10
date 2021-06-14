package com.vti.entity.ex5;

public class KySu extends CanBo{
	private String chuyenNganh;

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", chuyen Nganh: " + chuyenNganh;
	}
	
}
