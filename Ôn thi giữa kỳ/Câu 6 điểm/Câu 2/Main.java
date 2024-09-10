package Sixpoint2;

public class Main {

	public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.setChieuRong(5);
        hcn.setChieuDai(10);
        System.out.println("Diện tích hình chữ nhật: " + hcn.getDienTich());

        HinhVuong hv = new HinhVuong();
        hv.setCanh(4);
        System.out.println("Diện tích hình vuông: " + hv.getDienTich());
	}

}
