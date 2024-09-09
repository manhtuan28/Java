package Sixpoint;

public class Main {
    public static void main(String[] args) {
        XeDap xeDap = new XeDap();
        
        xeDap.setTen("Tên khác");
        
        System.out.println("Tên sản phẩm: " + xeDap.getTen());

        xeDap.setGia(1.5000);
        xeDap.setNhaCungCap("Công ty Tuancute");

        System.out.println("Giá: " + xeDap.getGia());
        System.out.println("Nhà cung cấp: " + xeDap.getNhaCungCap());
    }
}
