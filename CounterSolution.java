import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        System.out.println(counter.getCount()); // Output: 1
    }
}