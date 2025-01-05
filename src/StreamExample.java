import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // List of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using Streams to filter, map, and collect the results
        List<Integer> transformedNumbers = numbers.stream()
                // Filter even numbers
                .filter(num -> num % 2 == 0)
                // Double each number
                .map(num -> num * 2)
                // Collect the result into a new list
                .toList();

        // Print the result
        System.out.println("Transformed Numbers: " + transformedNumbers);
    }
}

//Transformed Numbers: [4, 8, 12, 16, 20]