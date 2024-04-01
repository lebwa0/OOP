package task1;

public class Task1Circle {

    public static void main(String[] args) {
        // Задаємо радіус кола
        double radius = 5.0;

        // Розраховуємо площу кола
        double area = calculateArea(radius);

        // Заокруглюємо площу до цілого числа
        long roundedArea = Math.round(area);

        // Виводимо площу кола
        System.out.println("Площа кола = " + roundedArea + " m^2");
    }

    // Метод для розрахунку площі кола
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
