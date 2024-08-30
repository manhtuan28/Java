package thuhanhbuoi2;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào số a: ");
		int a = sc.nextInt();
		
		System.out.println("Nhập vào số b: ");
		int b = sc.nextInt();
		
		int tong = a * a + b * b;
		
		System.out.println(a + " + " + b + " = " + tong);
	}

}
