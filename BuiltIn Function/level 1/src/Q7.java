import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int num1 = takeInput("Enter the first number: ");
        int num2 = takeInput("Enter the second number: ");

        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2, gcd);

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    public static int takeInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a % b);
    }

    public static int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
