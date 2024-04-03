package src.Task4.src;

import java.util.Scanner;

public class UserInterface {

    public static String[] getMenuSelection() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter menu selection:");
            String selection = scanner.nextLine();
            return selection.split(",");
        }
    }
}
