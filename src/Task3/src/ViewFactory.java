package src.Task3.src;
public interface ViewFactory {
    View createView(CalculationData calculationData);
    CalculationData getCalculationData(); // Додайте цей метод
}
