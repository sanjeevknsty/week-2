import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int terms = takeInput();
        generateFibonacci(terms);
    }

    public static int takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number  ");
        return scanner.nextInt();
    }

    public static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }
}
