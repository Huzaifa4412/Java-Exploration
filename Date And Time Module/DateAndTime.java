import java.time.LocalDate;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextWeek = today.plusDays(7);
        System.err.println(nextWeek);
    }
}