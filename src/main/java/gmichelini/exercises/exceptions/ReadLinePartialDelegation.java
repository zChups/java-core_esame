package gmichelini.exercises.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLinePartialDelegation {
    public static String readLinePartialDelegation(String filename) throws IOException {
        try (BufferedReader in = new BufferedReader(new FileReader(filename))) {
            return in.readLine();
        } catch (IOException e) {
            throw new IOException("ERROR with the file " +
                    filename);
        }
    }
}
