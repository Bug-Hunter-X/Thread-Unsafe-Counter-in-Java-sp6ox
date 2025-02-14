public class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count; 
    }
}

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        System.out.println(counter.getCount()); // Output: 1
    }
}