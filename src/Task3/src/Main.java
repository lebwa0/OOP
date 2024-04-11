package src.Task3.src;

import java.io.*;
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

        // Збереження результатів у файл
        saveResultsToFile(decimalNumber, binaryString, alternatingZeroes, alternatingOnes);

        // Відновлення результатів з файлу
        loadResultsFromFile();

        scanner.close();
    }

    private static void saveResultsToFile(int decimalNumber, String binaryString, int alternatingZeroes, int alternatingOnes) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("calculation_result.ser"))) {
            outputStream.writeInt(decimalNumber);
            outputStream.writeUTF(binaryString);
            outputStream.writeInt(alternatingZeroes);
            outputStream.writeInt(alternatingOnes);
            System.out.println("Результати обчислень було збережено у файл calculation_result.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadResultsFromFile() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("calculation_result.ser"))) {
            int decimalNumber = inputStream.readInt();
            String binaryString = inputStream.readUTF();
            int alternatingZeroes = inputStream.readInt();
            int alternatingOnes = inputStream.readInt();

            // Виведення відновлених результатів
            System.out.println("Тестуємо збереження результатів у файл та їх відновлення:");
            System.out.println("Результати обчислень було відновлено з файлу calculation_result.ser");
            System.out.println("= Результати обчислень");
            System.out.println("Десяткове число: " + decimalNumber);
            System.out.println("Двійкове представлення: " + binaryString);
            System.out.println("Кількість чергувань 0: " + alternatingZeroes);
            System.out.println("Кількість чергувань 1: " + alternatingOnes);
            System.out.println("=== Кінець результатів ===");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
