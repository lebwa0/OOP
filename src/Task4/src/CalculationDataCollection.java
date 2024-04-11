package src.Task4.src;

public class CalculationDataCollection {
    private int decimalNumber;

    // Конструктор для ініціалізації десяткового числа
    public CalculationDataCollection(int decimalNumber) {
        this.decimalNumber = decimalNumber;
    }

    // Метод для отримання двійкового представлення числа
    public String getBinaryRepresentation() {
        return Integer.toBinaryString(decimalNumber);
    }

    // Метод для підрахунку кількості чергувань 0 та 1
    public int[] countAlternations() {
        String binaryString = getBinaryRepresentation();
        int alternatingZeroes = 0;
        int alternatingOnes = 0;
        char lastChar = '\0';

        for (char c : binaryString.toCharArray()) {
            if (c != lastChar) {
                if (c == '0') {
                    alternatingZeroes++;
                } else {
                    alternatingOnes++;
                }
                lastChar = c;
            }
        }

        return new int[] {alternatingZeroes, alternatingOnes};
    }

    public double getComputedResult() {

        throw new UnsupportedOperationException("Unimplemented method 'getComputedResult'");
    }
}
