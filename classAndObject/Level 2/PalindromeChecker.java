public class PalindromeChecker {

    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public void check() {
        int i = 0;
        int j = text.length()-1;

        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) {
                System.out.println("Not a palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker("aaasssaa");
        checker.check();
    }
}
