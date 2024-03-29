public class CommandLineArguments {
    public static void main(String[] args) {
      
        if (args.length > 0) {
            System.out.println("Аргументи командного рядка:");

            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        } else {
            System.out.println("Немає аргументів командного рядка.");
        }
    }
}
