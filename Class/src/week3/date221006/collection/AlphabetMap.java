package week3.date221006.collection;

import java.util.HashMap;

public class AlphabetMap {
    public static void main(String[] args) {
        String address = "https://github.com/Kyeongrok/like-lion-java".toLowerCase();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (isAlphabet(c)) {
                try {
                    Integer num = map.get(c + "");
                    map.put(c+"", num + 1);
                } catch (Exception e){
                    map.put(c + "", 1);
                }
            }
        }

        System.out.println(map.toString());
    }

    private static boolean isAlphabet(char c1) {
        return 97 <= c1 && c1 <= 122;
    }
}
