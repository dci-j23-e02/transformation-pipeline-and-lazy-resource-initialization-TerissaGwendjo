import java.util.function.Supplier;

public class LazyInitializationInitialization {
    public static void main(String[] args) {
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
