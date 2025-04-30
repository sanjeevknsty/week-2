import java.time.LocalDate;

public class Q2 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        System.out.println("Added " + addedDate);

        LocalDate subtractedDate = date.minusWeeks(3);
        System.out.println("3 Weeks Subtracted "+subtractedDate);

    }
}
