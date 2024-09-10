package Sixpoint2;

public class HinhVuong extends HinhChuNhat{
    public void setCanh(int canh) {
        this.ChieuRong = canh;
        this.ChieuDai = canh;
    }

    @Override
    public int getDienTich() {
        return this.ChieuRong * this.ChieuDai;
    }
}
