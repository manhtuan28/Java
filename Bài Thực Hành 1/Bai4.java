package thuhanhbuoi2;

public class Bai4 {

    public static void main(String[] args) {
        String testString = "Tuancute";
        int count = countAlphabetCharacter(testString);
        System.out.println("Số ký tự chữ cái trong chuỗi là: " + count);
    }

    public static int countAlphabetCharacter(String inputString) {
        if (inputString == null) {
            return 0;
        }
        
        int count = 0;
        
        for (char ch : inputString.toCharArray()) {
            if (Character.isLetter(ch)) {
                count++;
            }
        }
        
        return count;
    }
}
