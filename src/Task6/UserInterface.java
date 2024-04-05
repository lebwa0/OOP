package src.Task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private List<Integer> savedResults;

    public UserInterface() {
        savedResults = new ArrayList<>();
    }

    public void processUserInput(String input, Scanner scanner) { 
        if (input.equals("1")) {
            System.out.print("Введіть десяткове число: ");
            int decimalNumber = scanner.nextInt();
            scanner.nextLine(); // Споживаємо символ нового рядка
            int count0 = BinaryCounter.countAlternatingBits(decimalNumber);
            int count1 = (int) Math.ceil((Math.log(decimalNumber + 1) / Math.log(2))) - count0;
            System.out.println("Кількість чергувань 0 у двійковому представленні числа " + decimalNumber + " дорівнює: " + count0);
            System.out.println("Кількість чергувань 1 у двійковому представленні числа " + decimalNumber + " дорівнює: " + count1);
            savedResults.add(decimalNumber);
            savedResults.add(count0);
            savedResults.add(count1);
        } else if (input.equals("2")) {
            System.out.println("Збережені результати:");
            for (int i = 0; i < savedResults.size(); i += 3) {
                int number = savedResults.get(i);
                int count0 = savedResults.get(i + 1);
                int count1 = savedResults.get(i + 2);
                System.out.println("Число: " + number);
                System.out.println("Кількість чергувань 0: " + count0);
                System.out.println("Кількість чергувань 1: " + count1);
            }
        } else if (input.equals("3")) {
            System.out.println("До побачення!");
            System.exit(0);
        } else {
            System.out.println("Невірна команда");
        }
    }
    

    public void run(Scanner scanner) { 
        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Підрахунок чергувань 0 та 1 у двійковому представленні числа");
            System.out.println("2. Показати збережені результати");
            System.out.println("3. Вихід");
            System.out.print("Оберіть опцію: ");
            String input = scanner.nextLine();
            processUserInput(input, scanner); 
        }
    }
}
