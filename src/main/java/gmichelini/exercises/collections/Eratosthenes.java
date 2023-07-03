package gmichelini.exercises.collections;

import java.util.HashSet;
import java.util.Set;

public class Eratosthenes {
    public static Set<Integer> eratosthenes(int n){
        Set<Integer> primes = new HashSet<>();
        //fill array
        for (int i = 1; i <= n; i++){
            primes.add(i);
        }
        //removes multiple for the currNumber
        for(int currNumber = 2; currNumber <= Math.sqrt(n); currNumber++){
            primes.removeAll(multiples(currNumber,n));
        }
        return primes;
    }

    private static Set<Integer> multiples(int number, int limit){   //contains multiples of the NUMBER until the LIMIT
        Set<Integer> dst = new HashSet<>();
        for (int i = 2; i*number <= limit; i++){
            dst.add(i*number);
        }
        return dst;
    }
}
