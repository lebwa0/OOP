public class TextView implements View {
    private CalculationData calculationData;

    public TextView(CalculationData calculationData) {
        this.calculationData = calculationData;
    }

    @Override
    public void displayResults(CalculationDataCollection calculationDataCollection) {
        System.out.println("Parameter1: " + calculationData.getParameter1());
        System.out.println("Parameter2: " + calculationData.getParameter2());
        System.out.println("Result: " + calculationData.getResult());
    }
}
