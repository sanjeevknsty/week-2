import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        int computer = (int)(Math.random() * 100);
        System.out.println( computer);

    }
}
