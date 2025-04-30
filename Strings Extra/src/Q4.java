public class Q4 {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        System.out.println("Modified String: " + result.toString());
    }
}
