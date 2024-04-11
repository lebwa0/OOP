package src.Task3.src;

public class MainViewFactory {
    public View createView(CalculationData calculationData) {
        return new TextView(calculationData);
    }

    public CalculationData getCalculationData() {
        return new CalculationData(0, 0, 0);
    }
}
