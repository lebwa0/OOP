package src.Task5;

/**
 * Конкретна реалізація інтерфейсу Command.
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    /**
     * Конструктор класу ConcreteCommand.
     * @param receiver Об'єкт типу Receiver, який буде виконувати дії команди.
     */
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * Метод виконання команди.
     */
    @Override
    public void execute() {
        receiver.doAction();
    }

    /**
     * Метод скасування виконаної команди.
     */
    @Override
    public void undo() {
        receiver.undoAction();
    }
}
