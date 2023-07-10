package gmichelini.exercises.exceptions;

import java.text.ParseException;
import java.time.LocalDateTime;

public class CheckIntervalBetweenDates {
    public static boolean checkIntervalBetweenDates(String begin, String end) throws ParseException {
        LocalDateTime first = LocalDateTime.parse(begin);
        return first.isBefore(LocalDateTime.parse(end));
    }
}
