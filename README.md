# Thread-Unsafe Counter in Java

This repository demonstrates a simple counter class in Java that is not thread-safe.  The `increment()` method is not atomic, leading to potential inaccuracies when accessed concurrently by multiple threads.

## Bug Description
The `Counter` class lacks synchronization mechanisms.  Multiple threads calling `increment()` simultaneously might interleave their operations, resulting in lost updates and an incorrect final count.

## Solution
The solution involves adding synchronization using either the `synchronized` keyword or using concurrent data structures like `AtomicInteger`.
