package src.Task4.src;

public class HtmlTablePresenter implements ResultPresenter {
    @Override
    public void presentResults(src.Task4.src.CalculationDataCollection data, String[] params) {
        int decimalNumber = Integer.parseInt(params[0]); // Отримуємо задане десяткове число
        String binaryString = Integer.toBinaryString(decimalNumber); // Перетворюємо його у двійкове представлення

        // Підрахунок кількості чергувань 0 та 1
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
        // Виведення результату у вигляді звичайної консольної таблиці
        System.out.println("+------------------+------------------+");
        System.out.println("|  Десяткове число  |  Двійкове число  |");
        System.out.println("+------------------+------------------+");
        System.out.println(String.format("|       %-11d | %-16s |", decimalNumber, binaryString));
        System.out.println("+------------------+------------------+");
        System.out.println("|  Послідовність 0  |  Послідовність 1  |");
        System.out.println("+------------------+------------------+");
        System.out.println(String.format("|       %-14d | %-16d |", alternatingZeroes, alternatingOnes));
        System.out.println("+------------------+------------------+");

    }
}


