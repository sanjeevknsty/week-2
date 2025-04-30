import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String foramtChanged = date.format(formatter);
        System.out.println(foramtChanged);

        String foramtChanged1 = date.format(formatter1);
        System.out.println(foramtChanged1);
    }
}
