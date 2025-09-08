import java.util.Arrays;
import java.util.List;

public class Exer1_Functional {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Functional approach: apply filtering, transformation, and aggregation
        int result = values.stream()
                           .filter(x -> x % 2 == 0)     // select even numbers
                           .map(x -> x * x)             // calculate square
                           .reduce(0, (a, b) -> a + b); // combine into sum

        System.out.println("Total of squared even numbers (Functional): " + result);
    }
}