package src.Task4.src;


import src.Task3.src.CalculationDataCollection;

public class MainTest {

    public void testTextTablePresenter() {
        // Створення об'єкта TextTablePresenter
        TextTablePresenter presenter = new TextTablePresenter();

        // Підготовка вхідних даних
        CalculationDataCollection data = new CalculationDataCollection();
        String[] params = {"param1", "param2", "param3"};
        
        presenter.presentResults(data, params);
    }
}
