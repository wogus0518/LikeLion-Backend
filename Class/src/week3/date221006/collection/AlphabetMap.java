package week3.date221006.collection;

import java.util.HashMap;
import java.util.Map;

class CountAlphabets {
    private final String str;
    private final Map<String, Integer> map;

    public CountAlphabets(String str) {
        this.str = str.toLowerCase();
        map = new HashMap<>();
    }

    public Map<String, Integer> count() {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isAlphabet(c)) {
                try {
                    Integer num = map.get(c + "");
                    map.put(c+"", num + 1);
                } catch (Exception e){
                    map.put(c + "", 1);
                }
            }
        }
        return map;
    }

    private static boolean isAlphabet(char c1) {
        return 97 <= c1 && c1 <= 122;
    }
}

public class AlphabetMap {
    public static void main(String[] args) {
        String address = "https://github.com/Kyeongrok/like-lion-java";

        CountAlphabets countAlphabets = new CountAlphabets(address);
        Map<String, Integer> result = countAlphabets.count();

        System.out.println(result.toString());
    }


}
