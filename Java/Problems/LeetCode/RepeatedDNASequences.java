
import java.util.ArrayList;
import java.util.HashMap;

public class RepeatedDNASequences {

    public static ArrayList<String> findRepeatedDnaSequences(String s) {

        ArrayList<String> repeatedSequences = new ArrayList<>();
        HashMap<String, Integer> seen = new HashMap<>();
        int i = 0;

        while (i + 10 <= s.length()) {
            String subsequence = s.substring(i, i++ + 10);
            seen.put(subsequence, seen.getOrDefault(subsequence, 0) + 1);
            if (seen.get(subsequence) == 2)
                repeatedSequences.add(subsequence);
        }

        return repeatedSequences;
    }

    public static void main(String[] args) {

        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";

        ArrayList<String> sequence = new ArrayList<>();

        sequence = findRepeatedDnaSequences(s);

        System.out.println(sequence);

        System.exit(0);
    }
}
