public class BinaryCount {
    public static void main(String[] args) {
        int decimalNumber = 42; // Задане десяткове число

        // Переводимо задане десяткове число у двійковий формат
        String binaryNumber = Integer.toBinaryString(decimalNumber);

        // Ініціалізуємо лічильники для 0 та 1
        int countZeros = 0;
        int countOnes = 0;

        // Проходимо по кожному символу у двійковому представленні
        for (int i = 0; i < binaryNumber.length(); i++) {
            char digit = binaryNumber.charAt(i);
            if (digit == '0') {
                countZeros++;
            } else if (digit == '1') {
                countOnes++;
            }
        }

        // Виводимо результати
        System.out.println("Кількість чергувань 0: " + countZeros);
        System.out.println("Кількість чергувань 1: " + countOnes);
    }
}
