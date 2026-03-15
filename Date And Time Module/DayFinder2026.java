import java.util.Calendar;
import java.util.Scanner;

public class DayFinder2026 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(2026, month - 1, day);

        System.err.println("Print Calendar.Day_OF_WEEK: " + Calendar.DAY_OF_WEEK);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.err.println("Print cal.get(Calendar.DAY_OF_WEEK) " + dayOfWeek);

        String dayName = "";

        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                dayName = "Sunday";
                break;
            case Calendar.MONDAY:
                dayName = "Monday";
                break;
            case Calendar.TUESDAY:
                dayName = "Tuesday";
                break;
            case Calendar.WEDNESDAY:
                dayName = "Wednesday";
                break;
            case Calendar.THURSDAY:
                dayName = "Thursday";
                break;
            case Calendar.FRIDAY:
                dayName = "Friday";
                break;
            case Calendar.SATURDAY:
                dayName = "Saturday";
                break;
        }

        System.out.println("The day is: " + dayName);

        sc.close();
    }
}