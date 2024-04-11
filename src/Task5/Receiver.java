package src.Task5;

public class Receiver {
    private String binaryString; // Зберігає двійкове представлення числа

    // Конструктор, який приймає десяткове число
    public Receiver(int decimalNumber) {
        this.binaryString = Integer.toBinaryString(decimalNumber);
    }

    // Метод, який виконує дію перетворення десяткового числа в двійкове представлення
    public void doAction() {
        // Виводимо послідовність одиниць
        System.out.println("Послідовність одиниць: " + countSequence('1'));
        // Виводимо послідовність нулів
        System.out.println("Послідовність нулів: " + countSequence('0'));
    }

    // Метод для підрахунку послідовності заданого символу
    private int countSequence(char c) {
        int count = 0;
        int maxCount = 0;
        for (char ch : binaryString.toCharArray()) {
            if (ch == c) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    // Метод для скасування дії
    public void undoAction() {
        System.out.println("Скасування дії");
        // Якщо потрібно виконати додаткові дії під час скасування,
        // вони можуть бути додані в цей метод
    }
}


