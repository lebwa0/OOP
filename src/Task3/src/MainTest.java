package src.Task3.src;

public class MainTest {

    @SuppressWarnings("")
    public void testProblemSolver() {
        ProblemSolver problemSolver = new ProblemSolver(10, 5);
        problemSolver.solve();
        assertEquals(15.0, problemSolver.getResult(), 0.001);
    }

    public void testViewFactory() {
        MainViewFactory viewFactory = new MainViewFactory();
        assertNotNull(viewFactory.createView(new CalculationData(10, 5, 15)));
    }

    private void assertNotNull(View view) {
        throw new UnsupportedOperationException("Unimplemented method 'assertNotNull'");
    }

    public void testTextView() {
        MainViewFactory viewFactory = new MainViewFactory();
        CalculationData calculationData = viewFactory.getCalculationData();
        calculationData.setResult(15);
        TextView textView = new TextView(calculationData);
        assertEquals("Result: 15", textView.display());
    }

    private void assertEquals(double d, double result, double e) {
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    private void assertEquals(String expected, String actual) {
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }
}
