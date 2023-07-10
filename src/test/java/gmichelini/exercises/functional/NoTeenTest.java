package gmichelini.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NoTeenTest {

    @Test
    void noTeen() {
        System.out.println(NoTeen.noTeen(List.of(13,12,14,19,20)).toString());

    }
}