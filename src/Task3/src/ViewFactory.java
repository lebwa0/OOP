package src.Task3.src;

public class ViewFactory {

    public View createView(String viewType) {
        switch (viewType) {
            case "TextView":
                return new TextView();
            default:
                throw new IllegalArgumentException("Invalid view type: " + viewType);
        }
    }
}
