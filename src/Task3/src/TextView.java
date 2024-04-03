package src.Task3.src;
public class TextView implements View {
    private CalculationData calculationData;

    public TextView(CalculationData calculationData) {
        this.calculationData = calculationData;
    }

    @Override
    public void displayResults(CalculationDataCollection calculationDataCollection) {
        // Виводимо результати
        System.out.println("Parameter1: " + calculationData.getParameter1());
        System.out.println("Parameter2: " + calculationData.getParameter2());
        System.out.println("Result: " + calculationData.getResult());
    }

    public String display() {
        return "Result: " + (int) calculationData.getResult(); 
    }
}
