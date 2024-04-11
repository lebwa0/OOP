package src.Task2.src.task2;

/**
 * Клас для знаходження рішення задачі з використанням агрегації.
 */
public class ProblemSolver {
    private CalculationData calculationData;

    /**
     * Конструктор класу з параметрами.
     * @param parameter1 Перший параметр обчислення.
     * @param parameter2 Другий параметр обчислення.
     */
    public ProblemSolver(double parameter1, double parameter2) {
        this.calculationData = new CalculationData(parameter1, parameter2, 0);
    }

    /**
     * Метод для знаходження рішення задачі.
     */
    public void solve() {
        double result = calculationData.getParameter1() * calculationData.getParameter2();
        calculationData = new CalculationData(calculationData.getParameter1(), calculationData.getParameter2(), result);
    }

    /**
     * Метод для отримання результату обчислення.
     * @return Результат обчислення.
     */
    public double getResult() {
        return calculationData.getResult();
    }
}
