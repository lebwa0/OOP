package src.Task3.src;

public class MainViewFactory implements ViewFactory {

    @Override
    public View createView(CalculationData calculationData) {
        return new TextView(calculationData);
    }

    @Override
    public CalculationData getCalculationData() {
        return new CalculationData(0, 0, 0);
    }
}
