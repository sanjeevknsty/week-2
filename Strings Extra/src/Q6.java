public class Q6 {
    public static void main(String[] args) {
        String str = "abababab";
        String subStr = "ab";
        int count = 0, index = 0;
        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        System.out.println("Occurrences: " + count);
    }
}
