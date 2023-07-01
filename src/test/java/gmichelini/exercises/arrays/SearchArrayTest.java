package gmichelini.exercises.arrays;

import org.junit.jupiter.api.Test;


class SearchArrayTest {

    @Test
    void containsBruteForce() {
        System.out.println(SearchArray.containsBruteForce(new String[]{"Ciao", "i'm", "michael"}, "Ciao"));
    }

    @Test
    void containsBinary() {
        System.out.println(SearchArray.containsBinary(new String[]{"Ciao", "i'm", "michael"}, "michael"));
    }
}