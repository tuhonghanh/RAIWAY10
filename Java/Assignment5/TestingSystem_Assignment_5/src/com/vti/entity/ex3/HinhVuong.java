package com.vti.entity.ex3;

public class HinhVuong extends HinhChuNhat {

	public HinhVuong(float a) {
		super(a, a);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public float tinhChuVi() {
		 return 4 * getA() ;
	}
	
	@Override
	public float tinhDienTich() {
		 return getA() * getA();
	}
}
