package src.Task6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private List<int[]> savedResults;

    public UserInterface() {
        savedResults = new ArrayList<>();
    }

    public void processUserInput(String input, Scanner scanner) {
        if (input.equals("1")) {
            System.out.print("Введіть десяткове число: ");
            int decimalNumber = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            int count0 = BinaryCounter.countAlternatingBits(decimalNumber);
            int count1 = (int) Math.ceil((Math.log(decimalNumber + 1) / Math.log(2))) - count0;
            System.out.println("Кількість чергувань 0 у двійковому представленні числа " + decimalNumber + " дорівнює: " + count0);
            System.out.println("Кількість чергувань 1 у двійковому представленні числа " + decimalNumber + " дорівнює: " + count1);
            savedResults.add(new int[]{decimalNumber, count0, count1});
        } else if (input.equals("2")) {
            System.out.println("Сортування за мінімальним числом:");
            savedResults.sort(Comparator.comparingInt(arr -> arr[0]));
            displayResults();
        } else if (input.equals("3")) {
            System.out.println("Сортування за максимальним числом:");
            savedResults.sort(Comparator.comparingInt((int[] arr) -> arr[0]).reversed());
            displayResults();
        } else if (input.equals("4")) {
            System.out.println("Сортування за кількістю чергувань 0:");
            savedResults.sort(Comparator.comparingInt(arr -> arr[1]));
            displayResults();
        } else if (input.equals("5")) {
            System.out.println("Сортування за кількістю чергувань 1:");
            savedResults.sort(Comparator.comparingInt(arr -> arr[2]));
            displayResults();
        } else if (input.equals("6")) {
            System.out.println("До побачення!");
            System.exit(0);
        } else {
            System.out.println("Невірна команда");
        }
    }

    private void displayResults() {
        for (int[] arr : savedResults) {
            System.out.println("Число: " + arr[0]);
            System.out.println("Кількість чергувань 0: " + arr[1]);
            System.out.println("Кількість чергувань 1: " + arr[2]);
        }
    }

    public void run(Scanner scanner) {
        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Підрахунок чергувань 0 та 1 у двійковому представленні числа");
            System.out.println("2. Сортування за мінімальним числом");
            System.out.println("3. Сортування за максимальним числом");
            System.out.println("4. Сортування за кількістю чергувань 0");
            System.out.println("5. Сортування за кількістю чергувань 1");
            System.out.println("6. Вихід");
            System.out.print("Оберіть опцію: ");
            String input = scanner.nextLine();
            processUserInput(input, scanner);
        }
    }

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        Scanner scanner = new Scanner(System.in);
        ui.run(scanner);
    }
}
