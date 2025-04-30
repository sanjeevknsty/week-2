import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("Enter a Date: ");
//        String Date = sc.nextLine();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        LocalDate date = LocalDate.parse(Date,formatter);
//        System.out.println(date);
//
//        DayOfWeek dayOfWeek = date.getDayOfWeek();
//        System.out.println(dayOfWeek);
//
//        LocalDate today = LocalDate.now();
//        long dayBetween = ChronoUnit.DAYS.between(today,date);
//        System.out.println(dayBetween);

        LocalTime IST = ZonedDateTime.now().toLocalTime();
        System.out.println("IST "+IST);

        ZonedDateTime GMT = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime PST = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("GMT " + GMT);
        System.out.println("PST " +PST);
    }
}
