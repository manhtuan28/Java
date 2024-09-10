package bondiem;

import java.util.Scanner;

public class Cau1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập chiều dài cạnh thứ nhất: ");
		double canh1 = sc.nextDouble();
		
		System.out.println("Nhập chiều dài cạnh thứ hai: ");
		double canh2 = sc.nextDouble();
		
		double chuVi = 2 * (canh1+canh2);
		
		double dienTich = canh1 * canh2;
		
		double chieuRong = Math.min(canh1, canh2);
		
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
        System.out.println("Chiều rộng (cạnh ngắn hơn): " + chieuRong);
	}

}
