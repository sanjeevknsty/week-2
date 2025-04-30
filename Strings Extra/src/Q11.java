import java.util.Arrays;

public class Q11 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        boolean isAnagram = Arrays.equals(chars1, chars2);
        System.out.println("Are Anagrams: " + isAnagram);
    }
}
