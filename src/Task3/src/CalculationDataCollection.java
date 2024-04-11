package src.Task3.src;

import java.io.Serializable;
import java.util.ArrayList;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Клас для зберігання колекції об'єктів типу ProblemSolver.
 * Цей клас є серіалізованим.
 */
public class CalculationDataCollection implements Serializable {
    private ArrayList<ProblemSolver> problemSolvers;

    /**
     * Конструктор класу, що ініціалізує пусту колекцію.
     */
    public CalculationDataCollection() {
        problemSolvers = new ArrayList<>();
    }

    /**
     * Метод для додавання об'єкта типу ProblemSolver до колекції.
     * @param problemSolver Об'єкт типу ProblemSolver для додавання.
     */
    public void add(ProblemSolver problemSolver) {
        problemSolvers.add(problemSolver);
    }

    /**
     * Метод для отримання всіх об'єктів типу ProblemSolver з колекції.
     * @return Колекція об'єктів типу ProblemSolver.
     */
    public ArrayList<ProblemSolver> getProblemSolvers() {
        return problemSolvers;
    }

    /**
     * Метод для збереження колекції у файл.
     * @param filename Шлях до файлу для збереження.
     * @throws IOException Якщо виникла помилка вводу/виводу.
     */
    public void saveToFile(String filename) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(this);
        }
    }

    /**
     * Метод для завантаження колекції з файлу.
     * @param filename Шлях до файлу для завантаження.
     * @return Завантажена колекція об'єктів типу CalculationDataCollection.
     * @throws IOException Якщо виникла помилка вводу/виводу.
     * @throws ClassNotFoundException Якщо клас не був знайдений під час десеріалізації.
     */
    public static CalculationDataCollection loadFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            return (CalculationDataCollection) inputStream.readObject();
        }
    }

    /**
     * Метод для обчислення загального результату всіх об'єктів типу ProblemSolver у колекції.
     * @return Загальний результат обчислень.
     */
    public double getComputedResult() {
        double sum = 0.0;
        for (ProblemSolver solver : problemSolvers) {
            sum += solver.getResult();
        }
        return sum;
    }
}
