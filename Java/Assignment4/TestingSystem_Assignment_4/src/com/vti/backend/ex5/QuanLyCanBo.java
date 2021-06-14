package com.vti.backend.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.ex5.CanBo;
import com.vti.entity.ex5.CongNhan;
import com.vti.entity.ex5.KySu;
import com.vti.entity.ex5.NhanVienVanPhong;

public class QuanLyCanBo {
	static Scanner scanner = new Scanner(System.in);
	static List<CanBo> danhSachCanBo = new ArrayList<CanBo>();

	public void ex5Question2() {
		// TODO Auto-generated method stub
		System.out.println("------------ * * * -------------------------");
		System.out.println("------------ * Chao mung den voi phan mem quan ly can bo * -------------------------");

		int idChucnang = 0;
		while (idChucnang != 5) {
			System.out.println("1. Them moi can bo");
			System.out.println("2. Tim kiem theo ho ten");
			System.out.println("3. Hien thi thong tin can bo");
			System.out.println("4. Xoa theo ten can bo");
			System.out.println("5. Thoat");
			System.out.print("Moi ban nhap vao chuc nang: ");

			idChucnang = scanner.nextInt();

			switch (idChucnang) {
			case 1:
				themMoiCanBo();
				break;
			case 2:
				timKiem();
				break;
			case 3:
				hienThiThongTin();
				break;
			case 4:
				xoaTheoTen();
				break;
			case 5:
				System.out.println("Cam on ban da su dung dich vu, xin chao va hen gap lai!!");;
				break;
			default:
				break;
			}
		}
		// scanner.close();
	}

	public static void themMoiCongNhan() {
		Scanner sc = new Scanner(System.in);
		CongNhan congNhan = new CongNhan();
		System.out.println("Moi ban nhap vao ten cong nhan: ");
		String tenCongNhan = sc.nextLine();

		System.out.println("Moi ban nhap vao gioi tinh cong nhan: ");
		String gioiTinh = sc.nextLine();

		System.out.println("Moi ban nhap vao dia chi cong nhan: ");
		String diaChi = sc.nextLine();

		System.out.println("Moi ban nhap vao cap bac cong nhan: ");
		String capBac = sc.nextLine();

		System.out.println("Moi ban nhap vao tuoi cong nhan: ");
		int tuoi = sc.nextInt();
		congNhan.setHoTen(tenCongNhan);
		congNhan.setGioiTinh(gioiTinh);
		congNhan.setDiaChi(diaChi);
		congNhan.setCapBac(capBac);
		congNhan.setTuoi(tuoi);
		danhSachCanBo.add(congNhan);
	}

	public static void themMoiKySu() {
		Scanner sc = new Scanner(System.in);
		KySu kySu = new KySu();
		System.out.println("Moi ban nhap vao ten ky su: ");
		String tenKySu = sc.nextLine();

		System.out.println("Moi ban nhap vao gioi tinh ky su: ");
		String gioiTinhKySu = sc.nextLine();

		System.out.println("Moi ban nhap vao dia chi ky su: ");
		String diaChiKySu = sc.nextLine();

		System.out.println("Moi ban nhap vao chuyen nganh bac ky su: ");
		String chuyenNganh = sc.nextLine();

		System.out.println("Moi ban nhap vao tuoi ky su: ");
		int tuoi = sc.nextInt();
		kySu.setHoTen(tenKySu);
		kySu.setGioiTinh(gioiTinhKySu);
		kySu.setDiaChi(diaChiKySu);
		kySu.setChuyenNganh(chuyenNganh);
		kySu.setTuoi(tuoi);
		danhSachCanBo.add(kySu);
	}

	public static void themMoiNhanVienVanPhong() {
		Scanner sc = new Scanner(System.in);
		NhanVienVanPhong nhanVienVanPhong = new NhanVienVanPhong();
		System.out.println("Moi ban nhap vao ten nhan vien: ");
		String tenCongNhan = sc.nextLine();

		System.out.println("Moi ban nhap vao gioi tinh nhan vien: ");
		String gioiTinh = sc.nextLine();

		System.out.println("Moi ban nhap vao dia chi nhan vien: ");
		String diaChi = sc.nextLine();

		System.out.println("Moi ban nhap vao cong viec nhan vien: ");
		String congViec = sc.nextLine();

		System.out.println("Moi ban nhap vao tuoi cong nhan: ");
		int tuoi = sc.nextInt();
		nhanVienVanPhong.setHoTen(tenCongNhan);
		nhanVienVanPhong.setGioiTinh(gioiTinh);
		nhanVienVanPhong.setDiaChi(diaChi);
		nhanVienVanPhong.setCongViec(congViec);
		nhanVienVanPhong.setTuoi(tuoi);
		danhSachCanBo.add(nhanVienVanPhong);
	}

	public static void themMoiCanBo() {
		System.out.println("1. Cong nhan");
		System.out.println("2. Ky Su");
		System.out.println("3. Nhan vien van phong");
		System.out.println("Moi ban nhap vao loai can bo: ");
		int idLoaiCanBo = scanner.nextInt();

		switch (idLoaiCanBo) {
		case 1:
			themMoiCongNhan();
			break;
		case 2:
			themMoiKySu();
			break;
		case 3:
			themMoiNhanVienVanPhong();
			break;
		default:
			break;
		}
	}

	public static void hienThiThongTin() {
		System.out.println("Thong tin can bo: ");
		for (CanBo canBo : danhSachCanBo) {
			System.out.println(canBo);
		}
	}

	public static void timKiem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap ten can bo can tim kiem: ");
		String tenCanBoTimKiem = sc.nextLine();
		if (tenCanBoTimKiem == null || tenCanBoTimKiem.equals("")) {
			System.out.println("Khong co can bo nao khong co ten");
		} else {
			for (CanBo canBo : danhSachCanBo) {
				if (tenCanBoTimKiem.equals(canBo.getHoTen()))  {
					System.out.println(canBo);
				} else {
					System.out.println("Khong tim thay can bo: " + tenCanBoTimKiem);
				}
			}
		}

	}

	public static void xoaTheoTen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap ten can bo can xoa: ");
		String tenCanBoXoa = sc.nextLine();
		if (tenCanBoXoa == null || tenCanBoXoa.equals("")) {
			System.out.println("Khong co can bo nao khong co ten");
		} else {
			List<CanBo> danhSachXoa = new ArrayList<CanBo>();
			for (CanBo canBo : danhSachCanBo) {
				if (tenCanBoXoa.equals(canBo.getHoTen())) {
					danhSachXoa.add(canBo);
				}
			}
			if (danhSachXoa.size() > 0) {
				danhSachCanBo.removeAll(danhSachXoa);
				System.out.println("ban da xoa nhung can bo co ten: " + tenCanBoXoa);
			} else {
				System.out.println("Khong tim thay can bo: " + tenCanBoXoa);
			}

		}
	}
}
