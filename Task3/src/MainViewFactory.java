public class MainViewFactory extends ViewFactory {
    @Override
    public View createView(CalculationData calculationData) {
        return new TextView(calculationData);
    }
}
