package src.Task4.src;

public class TextTablePresenter implements ResultPresenter {

    @Override
    public void presentResults(CalculationDataCollection data, String[] params) {
        // Отримання результуючого числа з CalculationDataCollection
        double result = data.getComputedResult();
        
        // Створення текстової таблиці з результатом
        System.out.println("+-------------+--------------+");
        System.out.println("|   Parameter |    Result    |");
        System.out.println("+-------------+--------------+");
        System.out.println("|     Result  |   " + result + " |");
        System.out.println("+-------------+--------------+");
    }
}
