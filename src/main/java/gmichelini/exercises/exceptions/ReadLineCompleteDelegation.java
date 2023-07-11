package gmichelini.exercises.exceptions;

import java.io.*;

public class ReadLineCompleteDelegation {
    public static String readLineCompleteDelegation(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        return in.readLine();
    }
}
