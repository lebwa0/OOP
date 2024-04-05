import java.util.Scanner;

public class BinaryCount {
    public static void countAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        int count0 = 0;
        int count1 = 0;

        // Перевірка чергування 0 та 1 в двійковому представленні
        for (int i = 0; i < binary.length() - 1; i++) {
            if (binary.charAt(i) != binary.charAt(i + 1)) {
                if (binary.charAt(i) == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }
        }

        System.out.println("Чергувань числа 0: " + count0);
        System.out.println("Чергувань числа 1: " + count1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть десяткове число: ");
        int decimalNumber = scanner.nextInt(); // Зчитуємо число з клавіатури
        countAlternatingBits(decimalNumber);
        scanner.close(); // Закриваємо Scanner
    }
}
