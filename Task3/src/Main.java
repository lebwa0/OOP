public class Main {
    public static void main(String[] args) {
        ProblemSolver solver1 = new ProblemSolver(10, 5);
        ProblemSolver solver2 = new ProblemSolver(7, 3);

        solver1.solve();
        solver2.solve();

        CalculationDataCollection dataCollection = new CalculationDataCollection();
        dataCollection.add(solver1);
        dataCollection.add(solver2);

        ViewFactory factory = new MainViewFactory();
        View view = factory.createView();
        view.displayResults(dataCollection);

        try {
            dataCollection.saveToFile("data.ser");
            CalculationDataCollection loadedData = CalculationDataCollection.loadFromFile("data.ser");
            view.displayResults(loadedData);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
