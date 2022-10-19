package main.week3.date221006.file.patient;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileOption {
        private String fileName;

    public ReadFileOption(String fileName) {
        this.fileName = fileName;
    }

    void fileList(){
        File dir = new File("./");
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }

    public void readLine() throws IOException {

        FileReader fileReader = new FileReader(this.fileName);
        int read1 = fileReader.read();
        System.out.println("read1 = " + read1);

        BufferedReader br1 = new BufferedReader(new FileReader(this.fileName));
        int read2 = br1.read();
        System.out.println("read2 = " + read2);

        BufferedReader br2 = Files.newBufferedReader(Paths.get(this.fileName), StandardCharsets.UTF_8);
        int read3 = br2.read();
        System.out.println("read3 = " + read3);

        FileInputStream fis = new FileInputStream("a_file.txt");
        int read4 = fis.read();
        System.out.println("read4 = " + read4);

        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(this.fileName), StandardCharsets.UTF_8);
        int read5 = inputStreamReader.read();
        System.out.println("read5 = " + read5);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.fileName));
        int read6 = bufferedInputStream.read();
        System.out.println("read6 = " + read6);

    }

    public static void main(String[] args) throws IOException {
        ReadFileOption readFileOption = new ReadFileOption("a_file.txt");
        readFileOption.readLine();
    }
}
