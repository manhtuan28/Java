package thuhanhbuoi2;

import java.util.Scanner;

public class Bai3 {

    public static boolean evaluateComparisonString(String inputString) {
        String regex = "(\\d+)\\s*([<>]=?|==)\\s*(\\d+)";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(inputString);
        
        if (matcher.matches()) {
            int s1 = Integer.parseInt(matcher.group(1));
            String operator = matcher.group(2);
            int s2 = Integer.parseInt(matcher.group(3));
            
            switch (operator) {
                case "<":
                    return s1 < s2;
                case ">":
                    return s1 > s2;
                case "==":
                    return s1 == s2;
                case "<=":
                    return s1 <= s2;
                case ">=":
                    return s1 >= s2;
                default:
                    return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập một chuỗi phép toán (ví dụ: 5 < 10):");
        String input = scanner.nextLine();

        boolean result = evaluateComparisonString(input);
        System.out.println("Kết quả phép toán là: " + result);

        scanner.close();
    }
}
