package gmichelini.exercises.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLinePartialDelegation {
    public static String readLinePartialDelegation(String filename){
        try(BufferedReader in = new BufferedReader(new FileReader(filename))){
            return in.readLine();
        } catch (IOException ioException){
            throw  new RuntimeException("Errore con il file" + filename);
        }
    }
}
