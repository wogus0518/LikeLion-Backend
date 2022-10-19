package main.week3.date221007.miniProject.parser;

import main.week3.date221007.miniProject.domain.HeightInfo;
import main.week3.date221007.miniProject.context.Parser;

public class PatientHeightParser implements Parser<HeightInfo> {
    @Override
    public HeightInfo parse(String str) {
        String[] strings = str.split(",");
        return new HeightInfo(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]));
    }
}
