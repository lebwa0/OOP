package src.Task5;

/**
 * Клас, що представляє отримувача команд.
 * Виконує певні дії та може скасувати їх виконання.
 */
public class Receiver {
    /**
     * Метод для виконання дії.
     */
    public void doAction() {
        System.out.println("Виконання дії");
    }

    /**
     * Метод для скасування виконаної дії.
     */
    public void undoAction() {
        System.out.println("Скасування дії");
    }
}


