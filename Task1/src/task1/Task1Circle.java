package task1;

public class Task1Circle {

    // Головний метод для запуску програми
    public static void main(String[] args) {
        // Задаємо радіус кола
        double radius = 5.0;

        // Виводимо площу кола
        System.out.println("Площа кола = " + calculateArea(radius) + " m^2");
    }

    // Метод для розрахунку площі кола
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
