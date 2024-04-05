package src.Task6;

import java.util.ArrayList;
import java.util.List;

public class ResultStorage {
    private List<Integer> results;

    public ResultStorage() {
        this.results = new ArrayList<>();
    }

    public void addResult(int result) {
        results.add(result);
    }

    public List<Integer> getResults() {
        return results;
    }
}
