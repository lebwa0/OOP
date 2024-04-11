package src.Task2.src.task2;

import java.io.*;

/**
 * Клас для демонстрації серіалізації та десеріалізації об'єкта.
 */
public class SerializationDemo {
    public static void main(String[] args) {
        // Створення об'єкта ProblemSolver для демонстрації серіалізації/десеріалізації
        ProblemSolver problemSolver = new ProblemSolver(10, 5);
        problemSolver.solve();

        // Збереження об'єкта в файл
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("problemSolver.ser"))) {
            outputStream.writeObject(problemSolver);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Відновлення об'єкта з файлу
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("problemSolver.ser"))) {
            ProblemSolver restoredProblemSolver = (ProblemSolver) inputStream.readObject();
            System.out.println("Restored result: " + restoredProblemSolver.getResult());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
