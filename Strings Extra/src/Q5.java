public class Q5 {
    public static void main(String[] args) {
        String sent = "The quickerrrrrr brown fox jumps";
        String[] words = sent.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Longest: " + longest);
    }
}
