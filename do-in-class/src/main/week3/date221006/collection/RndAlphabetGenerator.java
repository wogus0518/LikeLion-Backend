package main.week3.date221006.collection;

public class RndAlphabetGenerator implements AlphabetGenerator{
    @Override
    public char generate() {
        RndNumberGenerator rndNumberGenerator = new RndNumberGenerator();
        int rndNum = rndNumberGenerator.generate(26);
        char rndAlpha = (char) (rndNum + 65);
        return rndAlpha;
    }
}
