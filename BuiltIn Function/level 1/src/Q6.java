import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int number = takeInput();
        System.out.println("The factorial of " + number + " is: " + calculateFactorial(number));
    }

    public static int takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * calculateFactorial(n - 1);
    }
}
