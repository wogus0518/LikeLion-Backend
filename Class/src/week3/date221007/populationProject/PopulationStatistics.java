package week3.date221007.populationProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistics {

    public static void readByChar(String fileName) throws IOException {
        FileReader fileReader = new FileReader(new File(fileName));

        String fileContents = "";
        while (fileContents.length() < 1_000_000) {
            char c = (char) fileReader.read();
            fileContents += c;
            System.out.println(fileContents);
        }
        System.out.println(fileContents);
    }

    public static void readByLine(String fileName) throws IOException {
        FileReader fileReader = new FileReader(new File(fileName));
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public static void readByLine2(String fileName) {
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

    public PopulationMove parse(String data) {
        String[] split = data.split(",");
        int fromSido = Integer.parseInt(split[0]);
        int toSido = Integer.parseInt(split[6]);

        return new PopulationMove(fromSido, toSido);
    }

    public static void main(String[] args) throws IOException {
        String filename = "population_data_2021.csv";
        readByChar(filename);


    }
}
