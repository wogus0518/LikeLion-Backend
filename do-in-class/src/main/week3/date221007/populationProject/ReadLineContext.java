package main.week3.date221007.populationProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLineContext<T> {

    DoSomething<T> doSomething;

    public List<T> readByLine(String fileName) throws IOException {
        List<T> result = new ArrayList<>();
        FileReader fileReader = new FileReader(new File(fileName));
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            List<T> work = doSomething.work(line);
        }
        bufferedReader.close();
        return result;
    }
}
