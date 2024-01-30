# Comprehensive Assignment: Implementing a Data Transformation Pipeline and Lazy Resource Initialization in Java

## Assignment Overview

This assignment is designed to deepen your understanding of Java's functional programming capabilities, focusing on building a data transformation pipeline and implementing lazy resource initialization. You will leverage Java's built-in functional interfaces and the Stream API to process data efficiently and manage resource-intensive objects effectively. The assignment is divided into two parts, each aimed at solving a specific problem using functional programming techniques.

### Part 1: Building a Data Transformation Pipeline

#### Objective

Develop a Java program that constructs a pipeline for transforming a list of integers. This pipeline will apply a series of operations to produce a final list of processed integers, showcasing the power and flexibility of the Stream API for data processing tasks.

#### Task Breakdown

1. **Input Data Preparation**:
   - Define a list of integers ranging from 1 to 100. This will serve as the input for your data transformation pipeline.

2. **Pipeline Construction**:
   - **Step 1: Filtering** - Use the `filter` operation to retain only those numbers that are multiples of 5.
   - **Step 2: Transformation** - Apply the `map` operation to square each number that passed the filtering step.
   - **Step 3: Sorting** - Employ the `sorted` method with a comparator to arrange the squared numbers in descending order.

3. **Result Output**:
   - Print the final list of processed numbers to the console, demonstrating the successful application of the pipeline.

#### Code Snippet Example

```java
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DataTransformationPipeline {
    public static void TransformationPipeline(String[] args) {
        List<Integer> inputList = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());

        List<Integer> processedList = inputList.stream()
                .filter(number -> number % 5 == 0)
                .map(number -> number * number)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Processed Numbers: " + processedList);
    }
}
```

### Part 2: Implementing Lazy Resource Initialization

#### Objective

Implement a mechanism for lazy initialization of a resource-intensive object using the `Supplier` functional interface. This part of the assignment aims to demonstrate how lazy initialization can improve the efficiency of resource management in Java applications.

#### Task Breakdown

1. **Resource-Intensive Object Creation**:
   - Define a class named `HeavyResource` that simulates a resource-intensive operation by printing a message during its initialization.

2. **Lazy Initialization Implementation**:
   - Utilize a `Supplier<HeavyResource>` to implement the lazy initialization pattern. Ensure that the `HeavyResource` object is instantiated only on the first call to the supplier, with subsequent calls returning the already initialized instance.

3. **Demonstration**:
   - Demonstrate the lazy initialization by invoking the supplier multiple times. Verify through console output that the `HeavyResource` object is initialized only once.

#### Code Snippet Example

```java
import java.util.function.Supplier;

public class LazyInitializationInitialization {
    public static void TransformationPipeline(String[] args) {
        Supplier<HeavyResource> heavyResourceSupplier = LazyInitializationInitialization::createHeavyResource;

        // Simulate multiple calls to get the resource
        HeavyResource resource1 = heavyResourceSupplier.get();
        HeavyResource resource2 = heavyResourceSupplier.get();

        // Both variables should refer to the same instance
        System.out.println(resource1 == resource2); // Expected to print: true
    }

    private static HeavyResource createHeavyResource() {
        System.out.println("Initializing heavy resource...");
        return new HeavyResource();
    }

    static class HeavyResource {
        // Simulate a resource-intensive object
    }
}
```

### Submission Guidelines

- Ensure your code is well-commented, explaining the purpose and functionality of each part of your solution.
- Test your programs thoroughly to confirm they behave as expected. For Part 1, verify the correctness of the processed list. For Part 2, ensure the resource is initialized only once.
- Submit your source code files for both parts of the assignment, clearly labeled to indicate which part they correspond to.

This assignment offers a practical opportunity to apply functional programming concepts in Java, enhancing your skills in data processing and resource management. Good luck!
