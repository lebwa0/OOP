package src.Task6;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що відповідає за збереження результатів обчислень.
 */
public class ResultStorage {
    private List<Integer> results; // Список для зберігання результатів

    /**
     * Конструктор класу. Ініціалізує пустий список результатів.
     */
    public ResultStorage() {
        this.results = new ArrayList<>();
    }

    /**
     * Метод для додавання нового результату до списку.
     *
     * @param result Результат обчислення, що додається до списку.
     */
    public void addResult(int result) {
        results.add(result);
    }

    /**
     * Метод для отримання списку всіх результатів обчислень.
     *
     * @return Список результатів обчислень.
     */
    public List<Integer> getResults() {
        return results;
    }
}

