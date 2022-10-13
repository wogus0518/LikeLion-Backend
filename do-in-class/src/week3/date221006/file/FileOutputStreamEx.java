package week3.date221006.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) throws IOException {
        File file = new File("data");
        FileOutputStream fos = null;

        fos = new FileOutputStream(file);
        fos.write(65);
    }
}
