package com.vti.entity.ex3;

public class HinhChuNhat {
	private float a;
	private float b;
	
	public float tinhChuVi() {
		return 2 * (a + b);
		}
	
	public float tinhDienTich() {
		return a * b;
		}
	
	public HinhChuNhat (float a, float b) {
		this.a = a;
		this.b = b;
		}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}
	
	
}
