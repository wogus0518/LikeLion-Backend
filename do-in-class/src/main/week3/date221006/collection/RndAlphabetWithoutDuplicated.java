package main.week3.date221006.collection;

import java.util.HashSet;

public class RndAlphabetWithoutDuplicated {
    public static void main(String[] args) {
        RndAlphabetGenerator rndAlphabetGenerator = new RndAlphabetGenerator();
        HashSet<Character> store = new HashSet<>();

        for (int i = 0; i < 1000; i++) {
            char alphabet = rndAlphabetGenerator.generate();
            store.add(alphabet);
        }
        System.out.println("store = " + store);
        System.out.println("store.size = " + store.size());
    }
}
