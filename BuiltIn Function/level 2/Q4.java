import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dd/mm/yyyy");
        String date = sc.nextLine();
        System.out.println("dd/mm/yyyy");
        String date1 = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate inputToDate = LocalDate.parse(date, formatter);
        LocalDate inputToDate2 = LocalDate.parse(date1, formatter);

        if(inputToDate.isAfter(inputToDate2)){
            System.out.println("Date is after date");
        } else if (inputToDate.isBefore(inputToDate2)) {
            System.out.println("Date is before date");
        }else {
            System.out.println("Date is Same");
        }

    }
}
