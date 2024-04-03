/**
 * Клас для тестування коректності результатів обчислень та серіалізації/десеріалізації.
 */
public class Test {
    public static void main(String[] args) {
        // Створення об'єкта ProblemSolver для тестування
        ProblemSolver problemSolver = new ProblemSolver(10, 5);
        problemSolver.solve();
        System.out.println("Result: " + problemSolver.getResult());

        // Створення об'єкта CalculationData для тестування
        CalculationData calculationData = new CalculationData(10, 5, 50);
        System.out.println("Parameter1: " + calculationData.getParameter1());
        System.out.println("Parameter2: " + calculationData.getParameter2());
        System.out.println("Result: " + calculationData.getResult());

        // Запуск демонстрації серіалізації та десеріалізації
        SerializationDemo.main(args);
    }
}
