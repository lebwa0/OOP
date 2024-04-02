import java.io.Serializable;

public class CalculationData implements Serializable {
    private double parameter1;
    private double parameter2;
    private double result;

    public CalculationData(double parameter1, double parameter2, double result) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
        this.result = result;
    }

    public double getParameter1() {
        return parameter1;
    }

    public double getParameter2() {
        return parameter2;
    }

    public double getResult() {
        return result;
    }
}
