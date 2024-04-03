package src.Task3.src;
public class Test3 {
    public static void main(String[] args) {
        // Створення об'єкта ProblemSolver для тестування
        ProblemSolver problemSolver = new ProblemSolver(10, 5);
        problemSolver.solve();
        System.out.println("Result: " + problemSolver.getResult());

        // Створення об'єкта ViewFactory для створення екземпляру класу View
        ViewFactory viewFactory = new MainViewFactory();
        CalculationData calculationData = new CalculationData(10, 5, problemSolver.getResult());

        // Створення і відображення результатів обчислень у текстовому вигляді
        View view = viewFactory.createView(calculationData);
        view.displayResults(new CalculationDataCollection());
    }
}
