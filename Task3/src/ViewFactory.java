public abstract class ViewFactory {
    public abstract View createView();
}

public class TextViewFactory extends ViewFactory {
    @Override
    public View createView() {
        return new TextView();
    }
}
