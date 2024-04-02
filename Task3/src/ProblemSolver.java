import java.io.Serializable;

public class ProblemSolver implements Serializable {
    private CalculationData calculationData;

    public ProblemSolver(double parameter1, double parameter2) {
        this.calculationData = new CalculationData(parameter1, parameter2, 0);
    }

    public void solve() {
        double result = calculationData.getParameter1() + calculationData.getParameter2();
        calculationData = new CalculationData(calculationData.getParameter1(), calculationData.getParameter2(), result);
    }

    public double getResult() {
        return calculationData.getResult();
    }
}
