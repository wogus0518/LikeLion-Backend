package main.week3.date221007.miniProject.mainApp;

import main.week3.date221007.miniProject.context.ReadLineContext;
import main.week3.date221007.miniProject.context.WriterContext;
import main.week3.date221007.miniProject.domain.SidoCodeMap;
import main.week3.date221007.miniProject.parser.PopulationMoveParser;
import main.week3.date221007.populationProject.PopulationMove;

import java.io.IOException;
import java.util.*;

public class PopulationApp {
    public static void main(String[] args) throws IOException {
        final String filename = "population_data_2021.csv";
        ReadLineContext<PopulationMove> readLineContext = new ReadLineContext<>(new PopulationMoveParser());
        List<PopulationMove> pml = readLineContext.readByLine(filename);

        List<String> fromToList = new ArrayList<>();
        for (PopulationMove pm : pml) {
            String str = pm.getFromSido() + "," + pm.getToSido();
            fromToList.add(str);
        }

        Map<String, Integer> fromToCntMap = new HashMap<>();
        for (String fromTo : fromToList) {
            fromToCntMap.putIfAbsent(fromTo, 1);
            fromToCntMap.put(fromTo, fromToCntMap.get(fromTo) + 1);
        }

        Set<String> keys = fromToCntMap.keySet();
        List<String> strs = new ArrayList<>();
        SidoCodeMap sidoCodeMap = new SidoCodeMap();
        Map<Integer, String> codeMap = sidoCodeMap.getSidoCodeMap();
        for (String key : keys) {
            String fromSido = key.split(",")[0];
            if (fromSido.equals("11")) {
                String toSido = key.split(",")[1];
                String sidoName = codeMap.get(Integer.parseInt(toSido));
                strs.add(sidoName + "," + fromToCntMap.get(key) + " ");
            }
//            System.out.println(key + " : " + fromToCntMap.get(key));
        }
        System.out.println(strs);

        WriterContext writer = new WriterContext();
        writer.write(strs, "move_from_seoul_counts.csv");

    }
}
