package gmichelini.exercises.exceptions;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

public class CheckIntervalBetweenDatesAlt {
    public static boolean checkIntervalBetweenDatesAlt(String begin, String end){
        try{
            return LocalDateTime.parse(begin).isBefore(LocalDateTime.parse(end));
        } catch (DateTimeParseException e){
            return false;
        }
    }
}
