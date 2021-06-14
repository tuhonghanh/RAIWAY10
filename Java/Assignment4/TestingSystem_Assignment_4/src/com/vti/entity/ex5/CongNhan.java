package com.vti.entity.ex5;

public class CongNhan extends CanBo{
	private String CapBac;

	public String getCapBac() {
		return CapBac;
	}

	public void setCapBac(String capBac) {
		CapBac = capBac;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", Cap bac: " + CapBac;
	}	
}
