import java.util.Scanner;

public class BinaryCount {
    public static int countAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        
        // Перевірка чергування 0 та 1 в двійковому представленні
        for (int i = 0; i < binary.length() - 1; i++) {
            if (binary.charAt(i) != binary.charAt(i + 1)) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть десяткове число: ");
        int decimalNumber = scanner.nextInt(); // Зчитуємо число з клавіатури
        int alternatingBits = countAlternatingBits(decimalNumber);
        System.out.println("Кількість чергувань 0 та 1 у двійковому представленні числа " + decimalNumber + " дорівнює: " + alternatingBits);
        scanner.close(); 
    }
}
