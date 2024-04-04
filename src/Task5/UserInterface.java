package src.Task5;

import java.util.Scanner;

public class UserInterface {
    private CommandManager commandManager;

    public UserInterface() {
        commandManager = CommandManager.getInstance();
    }

    public void processUserInput(String input) {
        if (input.equals("execute")) {
            Command command = new ConcreteCommand(new Receiver());
            commandManager.executeCommand(command);
        } else if (input.equals("undo")) {
            commandManager.undoLastCommand();
        } else {
            System.out.println("Невідома команда");
        }
    }

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