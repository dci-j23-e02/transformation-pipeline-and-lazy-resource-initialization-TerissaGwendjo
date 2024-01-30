import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TransformationPipeline {
    public static void main(String[] args) {

        // Define a list of integers ranging from 1 to 100
        List<Integer> inputList = IntStream.rangeClosed(1, 100)
                .boxed()
                .collect(Collectors.toList());

        // Apply the data transformation pipeline
        List<Integer> processedList = inputList.stream()
                .filter(number -> number % 5 == 0) // Filtering - Retain only multiples of 5
                .map(number -> number * number) // Transformation - Square each number
                .sorted(Comparator.reverseOrder()) // Sorting - Sort squared numbers in descending order
                .collect(Collectors.toList());

        // Print the final list of processed numbers
        System.out.println("Processed Numbers: " + processedList);
    }

}
