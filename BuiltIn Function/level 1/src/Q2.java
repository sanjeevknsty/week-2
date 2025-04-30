import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int a = takeInput("Enter the first number: ");
        int b = takeInput("Enter the second number: ");
        int c = takeInput("Enter the third number: ");

        System.out.println("The maximum is: " + findMax(a, b, c));
    }

    public static int takeInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static int findMax(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }
}
