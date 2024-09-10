package Sixpoint2;

public class HinhChuNhat {
	protected int ChieuRong;
	protected int ChieuDai;
	
	public HinhChuNhat() {
		this.ChieuRong = 0;
		this.ChieuDai = 0;
	}
	
    public void setChieuRong(int inputChieuRong) {
        this.ChieuRong = inputChieuRong;
    }

    public void setChieuDai(int inputChieuDai) {
        this.ChieuDai = inputChieuDai;
    }

    public int getDienTich() {
        return this.ChieuRong * this.ChieuDai;
    }
}
