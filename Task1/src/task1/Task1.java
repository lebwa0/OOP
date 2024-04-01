package task1;

public class Task1 {

    public static void main(String[] args) {
        // Задаємо розміри прямокутника
        int length = 15;
        int width = 20;
        
        // Виводимо площу прямокутника
        System.out.println("Площа кімнати = " + Area.Calculate(length, width) + " m^2");
    }
}
