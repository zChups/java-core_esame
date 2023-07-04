package gmichelini.exercises.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class FromFile {
    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));

    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
}
