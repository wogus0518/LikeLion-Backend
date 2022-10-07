package week3.date221007.populationProject;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class PopulationStatistics {

    public void readByChar(String fileName) throws IOException {
        FileReader fileReader = new FileReader(new File(fileName));

        String fileContents = "";
        while (fileContents.length() < 1_000_000) {
            char c = (char) fileReader.read();
            fileContents += c;
            System.out.println(fileContents);
        }
        System.out.println(fileContents);
    }
    public void readByLine2(String fileName) {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8)) {

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public List<PopulationMove> readByLine(String fileName) throws IOException {
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            PopulationMove pm = parseV2(line);
            pml.add(pm);
        }
        bufferedReader.close();
        return pml;
    }

    public PopulationMove parse(String data) {
        String[] split = data.split(",");
        int fromSido = Integer.parseInt(split[6]);
        int toSido = Integer.parseInt(split[0]);

        return new PopulationMove(fromSido, toSido);
    }

    public PopulationMove parseV2(String data) {
        String[] split = data.split(",");
        int fromSido = Integer.parseInt(split[0]);
        int toSido = Integer.parseInt(split[1]);

        return new PopulationMove(fromSido, toSido);
    }

    public void createFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // List<String>을 지정한 파일에 write
    public void write(List<String> strs, String fileName) throws IOException {
        File file = new File(fileName);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getToSido();
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> populationMoveList) {
        HashMap<String, Integer> moveCntMap = new HashMap<>();
        for (PopulationMove pm : populationMoveList) {
            String key = fromToString(pm);
            if (moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
        return moveCntMap;
    }
    public static void main(String[] args) throws IOException {
//        String filename = "population_data_2021.csv";
//        PopulationStatistics populationStatistics = new PopulationStatistics();
//        List<PopulationMove> pml = populationStatistics.readByLine(filename);
//
//        ArrayList<String> strings = new ArrayList<>();
//        for (PopulationMove pm : pml) {
//            String fromTo = populationStatistics.fromToString(pm) + "\n";
//            strings.add(fromTo);
//        }
//
//        populationStatistics.write(strings, "from_to.txt");

        String filename = "from_to.txt";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine(filename);

        Map<String, Integer> moveCntMap = populationStatistics.getMoveCntMap(pml);
        String targetFilename = "each_sido_cnt.txt";
        populationStatistics.createFile(targetFilename);
        List<String> cntResult = new ArrayList<>();
        for (String key : moveCntMap.keySet()) {
            String s = String.format("key:%s    value:%d\n", key, moveCntMap.get(key));
            cntResult.add(s);
        }
        populationStatistics.write(cntResult, targetFilename);
    }
}
