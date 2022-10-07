package week3.date221007.miniProject.parser;

import week3.date221007.miniProject.context.Parser;
import week3.date221007.miniProject.domain.HeightInfo;

public class PatientHeightParser implements Parser<HeightInfo> {
    @Override
    public HeightInfo parse(String str) {
        String[] strings = str.split(",");
        return new HeightInfo(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]));
    }
}
