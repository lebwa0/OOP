import java.io.Serializable;

/**
 * Клас для зберігання параметрів і результатів обчислень.
 * Цей клас є серіалізованим.
 */
public class CalculationData implements Serializable {
    private double parameter1;
    private double parameter2;
    private double result;

    /**
     * Конструктор класу з параметрами.
     * @param parameter1 Перший параметр обчислення.
     * @param parameter2 Другий параметр обчислення.
     * @param result Результат обчислення.
     */
    public CalculationData(double parameter1, double parameter2, double result) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
        this.result = result;
    }

    /**
     * Метод для отримання першого параметра обчислення.
     * @return Перший параметр обчислення.
     */
    public double getParameter1() {
        return parameter1;
    }

    /**
     * Метод для отримання другого параметра обчислення.
     * @return Другий параметр обчислення.
     */
    public double getParameter2() {
        return parameter2;
    }

    /**
     * Метод для отримання результату обчислення.
     * @return Результат обчислення.
     */
    public double getResult() {
        return result;
    }
}
