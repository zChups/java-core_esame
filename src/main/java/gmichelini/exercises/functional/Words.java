package gmichelini.exercises.functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Words {
    public static long howManyLines(String filename, String subString) throws IOException {
        List<String> lines = getLines(filename);
        return lines.stream()
                .filter(s -> s.contains(subString))
                .count();
    }
    public static long howManyTimes(String filename, String word) throws IOException {
        List<String> lines = getLines(filename);
        return lines.stream()
                .flatMap(Words::lineToWords)
                .filter(s -> s.equals(word))
                .count();
    }
    private static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    private static Stream<String> lineToWords(String line) {
        return Arrays.stream(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
}
