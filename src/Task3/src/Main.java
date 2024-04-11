package src.Task3.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення числа
        System.out.print("Введіть десяткове число: ");
        int decimalNumber = scanner.nextInt();

        // Перетворення числа у двійкове представлення
        String binaryString = Integer.toBinaryString(decimalNumber);

        // Підрахунок кількості чергувань 0 та 1 у двійковому представленні числа
        int alternatingZeroes = 0;
        int alternatingOnes = 0;
        char lastChar = '\0';

        for (char c : binaryString.toCharArray()) {
            if (c != lastChar) {
                if (c == '0') {
                    alternatingZeroes++;
                } else {
                    alternatingOnes++;
                }
                lastChar = c;
            }
        }

        // Виведення результатів
        System.out.println("=== Результати обчислень ===");
        System.out.println("Десяткове число: " + decimalNumber);
        System.out.println("Двійкове представлення: " + binaryString);
        System.out.println("Кількість чергувань 0: " + alternatingZeroes);
        System.out.println("Кількість чергувань 1: " + alternatingOnes);
        System.out.println("=== Кінець результатів ===");

        scanner.close();
    }
}
