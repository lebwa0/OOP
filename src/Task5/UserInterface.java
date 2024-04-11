package src.Task5;
import java.util.Scanner;
public class UserInterface {
    private CommandManager commandManager;
    private Scanner scanner;
    private int decimalNumber; // Зберігає введене десяткове число

    public UserInterface() {
        commandManager = CommandManager.getInstance();
        scanner = new Scanner(System.in);
        decimalNumber = 0; // Початкове значення десяткового числа
    }
    // Метод для обробки введеного числа користувачем
    public void processUserInputForNumber() {
        System.out.println("Введіть десяткове число: ");
        decimalNumber = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера введення
        System.out.println("Ви ввели число: " + decimalNumber);
        System.out.println("Щоб виконати обчислення, введіть 'E'. Щоб скасувати введення числа, введіть 'U'.");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("E")) {
            performCalculation();
        } else if (input.equalsIgnoreCase("U")) {
            // Скасування введення числа, повертаємось до початку
            decimalNumber = 0;
        } else {
            System.out.println("Невірний ввід. Введіть 'E' для обчислення a6o 'U' для скасування.");
        }
    }
// Метод для виконання обчислення
    private void performCalculation() {
    Command command = new ConcreteCommand(new Receiver(decimalNumber)); // Передаємо десяткове число в команду
    commandManager.executeCommand(command);
    System.out.println("Результат обчислення:");
    command.execute(); // Виводимо результат обчислення
    commandManager.undoLastCommand(); // Відміняємо останню команду (обчислення)
}
    public void run() {
        try {
            while (true) {
                // Якщо десяткове число ще не введено, запитуємо його
                if (decimalNumber == 0) {
                    processUserInputForNumber();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
