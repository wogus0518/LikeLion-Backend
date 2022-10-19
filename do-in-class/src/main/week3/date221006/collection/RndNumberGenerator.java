package main.week3.date221006.collection;

public class RndNumberGenerator implements NumberGenerator{
    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
    }
}
