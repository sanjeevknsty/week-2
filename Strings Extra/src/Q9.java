import java.util.HashMap;

public class Q9 {
    public static void main(String[] args) {
        String str = "success";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        char mostFrequent = ' ';
        int maxFrequency = 0;
        for (char c : frequencyMap.keySet()) {
            if (frequencyMap.get(c) > maxFrequency) {
                mostFrequent = c;
                maxFrequency = frequencyMap.get(c);
            }
        }
        System.out.println("Most Frequent Character: " + mostFrequent);
    }
}
