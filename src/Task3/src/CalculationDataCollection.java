package src.Task3.src;

import java.io.Serializable;
import java.util.ArrayList;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class CalculationDataCollection implements Serializable {
    private ArrayList<ProblemSolver> problemSolvers;

    public CalculationDataCollection() {
        problemSolvers = new ArrayList<>();
    }

    public void add(ProblemSolver problemSolver) {
        problemSolvers.add(problemSolver);
    }

    public ArrayList<ProblemSolver> getProblemSolvers() {
        return problemSolvers;
    }

    public void saveToFile(String filename) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(this);
        }
    }

    public static CalculationDataCollection loadFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            return (CalculationDataCollection) inputStream.readObject();
        }
    }
}
