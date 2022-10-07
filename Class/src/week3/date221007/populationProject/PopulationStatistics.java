package week3.date221007.populationProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
        FileReader fileReader = new FileReader(new File(fileName));
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            PopulationMove pm = parse(line);
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

    public void createFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws IOException {
        String filename = "population_data_2021.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
//        List<PopulationMove> pml = populationStatistics.readByLine(filename);
//
//        for (PopulationMove pm : pml) {
//            System.out.printf("전입:%s, 전출:%s\n", pm.getFromSido(), pm.getToSido());
//        }
//        System.out.println(pml.size());
        populationStatistics.createFile("./from_to.txt");
    }
}
