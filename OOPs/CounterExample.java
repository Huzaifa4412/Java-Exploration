class Counter {
    static int count;
    private static int globalID;
    int id;

    Counter() {
        count += 1;
        globalID += 1;
        id = globalID;
    }

    static void resetCounter() {
        count = 0;
    }
}

public class CounterExample {

    public static void main(String[] args) {
        System.err.println("Hello, World");
        Counter counts = new Counter(); // Count = 1
        Counter count2 = new Counter(); // Count = 2
        Counter count3 = new Counter(); // Count = 3
        // System.err.println(counts.count);
        System.err.println("Printing Id's");
        System.out.println(counts.id);
        System.out.println(count2.id);
        System.out.println(count3.id);
        // Printing Counter Count
        System.err.println("Printing Counter Count " + Counter.count);
        // reset Counter
        Counter.resetCounter();
        System.err.println("Counter Count After Reset " + Counter.count);
        // Creating New Counter After Reset
        Counter count4 = new Counter(); // Count = 1
        System.out.println(counts.id);
        System.out.println(count2.id);
        System.out.println(count3.id);
        System.out.println(count4.id);
    }
}
