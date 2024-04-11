package src.Task4.src;

public class MainTest {

    public static void main(String[] args) {
        // Створення екземпляра HtmlTablePresenter
        HtmlTablePresenter presenter = new HtmlTablePresenter();

        // Підготовка вхідних даних
        CalculationDataCollection data = new CalculationDataCollection(0);
        int decimalNumber = 15; 
        String[] params = {String.valueOf(decimalNumber)}; // Конвертування числа в масив параметрів

        // Виклик методу presentResults() для створення та відображення HTML-таблиці
        presenter.presentResults(data, params);
    }
}
