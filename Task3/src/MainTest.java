import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @SuppressWarnings("")
    @Test
    public void testProblemSolver() {
        ProblemSolver problemSolver = new ProblemSolver(10, 5);
        problemSolver.solve();
        assertEquals(15.0, problemSolver.getResult(), 0.001);
    }

    @Test
    public void testViewFactory() {
        ViewFactory viewFactory = new MainViewFactory();
        assertNotNull(viewFactory.createView(new CalculationData(10, 5, 15)));
    }

    @Test
    public void testTextView() {
    ViewFactory viewFactory = new MainViewFactory();

    CalculationData calculationData = viewFactory.getCalculationData();

    calculationData.setResult(15);

    TextView textView = new TextView(calculationData);


    assertEquals("Result: 15", textView.display());
}

    
    
}
