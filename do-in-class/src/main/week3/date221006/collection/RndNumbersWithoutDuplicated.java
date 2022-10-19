package main.week3.date221006.collection;

import java.util.HashSet;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RndNumberGenerator rndNumberGenerator = new RndNumberGenerator();
        HashSet<Integer> store = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            int r = rndNumberGenerator.generate(10);
            store.add(r);
        }
        System.out.println("store = " + store);
    }
}
