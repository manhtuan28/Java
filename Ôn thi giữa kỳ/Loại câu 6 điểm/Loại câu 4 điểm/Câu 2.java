package bondiem;

import java.util.Scanner;

public class Cau2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Nhập chiều dài cạnh của khối lập phương: ");
        double chieuDai = sc.nextDouble();
        
        double theTich = Math.pow(chieuDai, 3);
        
        System.out.println("Thể tích của khối lập phương là: " + theTich);

	}

}
