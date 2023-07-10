package gmichelini.exercises.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineNoDelegation {
    public static String readLineNoDelegation(String filename) {
        try(BufferedReader in = new BufferedReader(new FileReader(filename))){
            return in.readLine();
        } catch (IOException ioException){
            return null ;
        }
    }
}
