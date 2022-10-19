package main.week3.date221007.populationProject;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "population_data_2021.csv";

        ReadLineContext<PopulationMove> readLineContext = new ReadLineContext<>();
        List<PopulationMove> filename1 = readLineContext.readByLine("filename");
    }
}
