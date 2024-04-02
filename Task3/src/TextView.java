public class TextView implements View {
    @Override
    public void displayResults(CalculationDataCollection data) {
        for (ProblemSolver solver : data.getProblemSolvers()) {
            System.out.println("Parameter 1: " + solver.getParameter1());
            System.out.println("Parameter 2: " + solver.getParameter2());
            System.out.println("Result: " + solver.getResult());
            System.out.println("----------------------");
        }
    }
}
