package src.Task4.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкту CalculationDataCollection
        CalculationDataCollection data = new CalculationDataCollection(0);
        // Додавання даних до CalculationDataCollection, якщо необхідно

        // Зчитування десяткового числа з консолі
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть десяткове число: ");
        int decimalNumber = scanner.nextInt();

        // Створення об'єкту HtmlTablePresenter
        HtmlTablePresenter presenter = new HtmlTablePresenter();

        // Виклик методу presentResults для відображення результату у вигляді таблиці
        presenter.presentResults(data, new String[] {String.valueOf(decimalNumber)});

        // Закриття Scanner
        scanner.close();
    }
}
