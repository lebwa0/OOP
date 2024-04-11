package src.Task5;

import java.util.Scanner;

/**
 * Клас, що представляє користувацький інтерфейс для взаємодії з користувачем.
 */
public class UserInterface {
    private CommandManager commandManager;

    /**
     * Конструктор класу UserInterface.
     * Ініціалізує об'єкт командного менеджера.
     */
    public UserInterface() {
        commandManager = CommandManager.getInstance();
    }

    /**
     * Метод для обробки введених користувачем команд.
     * @param input Рядок, який містить введену користувачем команду.
     */
    public void processUserInput(String input) {
        if (input.equals("execute")) {
            Command command = (Command) new ConcreteCommand(null);
            commandManager.executeCommand(command);
        } else if (input.equals("undo")) {
            commandManager.undoLastCommand();
        } else {
            System.out.println("Невідома команда");
        }
    }

    /**
     * Метод для запуску користувацького інтерфейсу.
     * Відображає промпт для введення команд та обробляє введення.
     */
    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Введіть команду (execute/undo): ");
                String input = scanner.nextLine();
                processUserInput(input);
            }
        }
    }
}
