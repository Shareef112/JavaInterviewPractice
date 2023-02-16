package problems;

import java.util.*;

public class TopKFrequentWords {
    public static void main(String[] args) {
        System.out.println(topKFrequent(new String[]{"i","love","leetcode","i","love","coding"},2));
        System.out.println(topKFrequent(new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"},4));

    }

    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> word_count = new HashMap<> ();

        for (String word : words) {
            word_count.put(word, word_count.getOrDefault(word, 0) + 1);
        }

        List<String> candidates = new ArrayList<> (word_count.keySet());

        Collections.sort(candidates, (w1, w2) -> word_count.get(w1).equals(word_count.get(w2)) ? w1.compareTo(w2) : word_count.get(w2) - word_count.get(w1));

        return candidates.subList(0, k);
    }
}
