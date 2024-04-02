public class ViewFactory {
    public View createView(CalculationData calculationData) {
        return new TextView(calculationData);
    }
}
