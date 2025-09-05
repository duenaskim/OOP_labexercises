import java.util.Arrays;
import java.util.List;

public class Exer1_Imperative {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Imperative approach: detailed steps with explicit control flow
        int total = 0;
        for (int num : values) {
            if (num % 2 == 0) {             // verify if number is even
                total += num * num;         // square and accumulate
            }
        }

        System.out.println("Total of squared even numbers (Imperative): " + total);
    }
}