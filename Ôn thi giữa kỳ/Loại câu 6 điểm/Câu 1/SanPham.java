package Sixpoint;

public class SanPham {
	private String Ten;
	private double Gia;
	private String NhaCungCap;

	public SanPham() {
		this.Ten = "";
		this.Gia = 0.0;
		this.NhaCungCap = "";
	}

	public void setTen(String inputTen) {
		this.Ten = inputTen;
	}

	public String getTen() {
		return this.Ten;
	}

	public void setGia(double gia) {
		this.Gia = gia;
	}

	public double getGia() {
		return this.Gia;
	}

	public void setNhaCungCap(String nhaCungCap) {
		this.NhaCungCap = nhaCungCap;
	}

	public String getNhaCungCap() {
		return this.NhaCungCap;
	}
}
