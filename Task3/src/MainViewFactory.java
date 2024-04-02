public class MainViewFactory implements ViewFactory {

    @Override
    public View createView(CalculationData calculationData) {
        // Тут ви повинні повернути екземпляр класу View залежно від переданого CalculationData
        return new TextView(calculationData);
    }

    @Override
    public CalculationData getCalculationData() {
        // Тут ви повинні повернути CalculationData з параметрами
        return new CalculationData(0, 0, 0);
    }
}
