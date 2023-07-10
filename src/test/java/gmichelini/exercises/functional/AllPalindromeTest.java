package gmichelini.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllPalindromeTest {

    @Test
    void allPalindrome() {
        assertTrue(AllPalindrome.allPalindrome(List.of("kayak", "deed", "noon")));
    }
}