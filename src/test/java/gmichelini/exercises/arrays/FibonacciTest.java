package gmichelini.exercises.arrays;

import org.junit.jupiter.api.Test;


class FibonacciTest {

    @Test
    void fibonacci() {
        long[] oks = Fibonacci.fibonacci(5);
        for (long i : oks){
            System.out.println(i);
        }
    }
}