package src.Task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private List<Integer> savedResults;

    public UserInterface() {
        savedResults = new ArrayList<>();
    }

    public void processUserInput(String input) {
        if (input.equals("1")) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Введіть десяткове число: ");
                int decimalNumber = scanner.nextInt();
                int alternatingBits = BinaryCounter.countAlternatingBits(decimalNumber);
                System.out.println("Кількість чергувань 0 та 1 у двійковому представленні числа " + decimalNumber + " дорівнює: " + alternatingBits);
                savedResults.add(decimalNumber);
                savedResults.add(alternatingBits);
            }
        } else if (input.equals("2")) {
            System.out.println("Збережені результати:");
            for (int i = 0; i < savedResults.size(); i += 2) {
                int number = savedResults.get(i);
                int count = savedResults.get(i + 1);
                System.out.println(number + ": " + count);
            }
        } else if (input.equals("3")) {
            System.out.println("До побачення!");
            System.exit(0);
        } else {
            System.out.println("Невірна команда");
        }
    }

    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Меню:");
                System.out.println("1. Підрахунок чергувань 0 та 1 у двійковому представленні числа");
                System.out.println("2. Показати збережені результати");
                System.out.println("3. Вихід");
                System.out.print("Оберіть опцію: ");
                String input = scanner.nextLine();
                processUserInput(input);
            }
        }
    }
}
