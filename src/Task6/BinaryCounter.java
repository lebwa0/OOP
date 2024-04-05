package src.Task6;

public class BinaryCounter {
    public static int countAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;

        // Підрахунок чергування 0 та 1 в двійковому представленні
        for (int i = 0; i < binary.length() - 1; i++) {
            if (binary.charAt(i) != binary.charAt(i + 1)) {
                count++;
            }
        }

        return count;
    }
}

