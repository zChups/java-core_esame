package gmichelini.exercises.exceptions;

import java.text.ParseException;
import java.time.LocalDate;

public class CheckIntervalBetweenDates {
    public static boolean checkIntervalBetweenDates(String begin, String end) throws ParseException {
        LocalDate date1 = LocalDate.parse(begin);
        LocalDate date2 = LocalDate.parse(end);

        return date1.isBefore(date2);

    }

}
