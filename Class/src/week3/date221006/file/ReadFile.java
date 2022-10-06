package week3.date221006.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    private final String filename;

    public ReadFile(String filename) {
        this.filename = filename;
    }

    void fileList(){
        File dir = new File("./");
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }

    public BufferedReader getBufferedReader(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename),16 * 1024);
        return br;
    }

    public void readNbytes(int num) throws IOException {
        BufferedReader br = getBufferedReader(this.filename);
        for (int i = 0; i < num; i++) {
            System.out.print((char) br.read());
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("a_file.txt");
        readFile.fileList();
        /**
         * .\.git
         * .\.gitignore
         * .\.idea
         * .\Algorithm
         * .\a_file.txt
         * .\Class
         * .\out
         * .\README.md
         */

        // 1글자 읽기
        readFile.readNbytes(1);

        // 2글자 읽기
        readFile.readNbytes(2);
    }
}
