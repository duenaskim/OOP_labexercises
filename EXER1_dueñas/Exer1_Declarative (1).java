import java.util.Arrays;
import java.util.List;

public class Exer1_Declarative {
    public static void main(String[] args) {
        List<String> people = Arrays.asList("fritz", "Lang", "Budd", "Dad");

        // Declarative approach: specify the condition (names beginning with 'f')
        people.stream()
              .filter(person -> person.startsWith("f"))
              .forEach(person -> System.out.println("Found name with f: " + person));
    }