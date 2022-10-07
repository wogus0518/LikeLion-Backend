package week3.date221007.miniProject.parser;

import week3.date221007.miniProject.context.Parser;
import week3.date221007.populationProject.PopulationMove;

public class PopulationMoveParser implements Parser<PopulationMove> {
    @Override
    public PopulationMove parse(String str) {
        String[] tokens = str.split(",");
        int fromSido = Integer.parseInt(tokens[6]);
        int toSido = Integer.parseInt(tokens[0]);
        return new PopulationMove(fromSido, toSido);
    }
}
