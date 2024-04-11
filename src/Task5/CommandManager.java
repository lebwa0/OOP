package src.Task5;
import java.util.Stack;
/**
 * Клас для керування командами.
 */
public class CommandManager {
    private static CommandManager instance;
    private Stack<Command> commandHistory;
    /**
     * Приватний конструктор для ініціалізації командної історії.
     */
    private CommandManager() {
        commandHistory = new Stack<>();
    }
    /**
     * Метод, що повертає єдиний екземпляр класу CommandManager (шаблон Singleton).
     * @return Єдиний екземпляр класу CommandManager.
     */
    public static CommandManager getInstance() {
        if (instance == null) {
            instance = new CommandManager();
        }
        return instance;
    }
    /**
     * Метод для виконання команди та додавання її до історії.
     * @param command Команда, яку потрібно виконати.
     */
    public void executeCommand(Command command) {
        command.execute();
        commandHistory.push(command);
    }
    /**
     * Метод для скасування останньої виконаної команди.
     */
    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }
}


