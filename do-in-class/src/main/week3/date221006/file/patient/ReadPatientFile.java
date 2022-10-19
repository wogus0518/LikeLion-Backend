package main.week3.date221006.file.patient;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ReadPatientFile {
    private final String fileName;

    public ReadPatientFile(String fileName) {
        this.fileName = fileName;
    }

    public HashMap<Integer, Patient> readFile() {
        File file = new File(this.fileName);
        String line = "";
        HashMap<Integer, Patient> store = new HashMap<>();

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, "\t");
                try {
                    int id = Integer.parseInt(st.nextToken());
                    String hid = st.nextToken();
                    double height = Double.parseDouble(st.nextToken());
                    Patient patient = new Patient(id, hid, height);
                    store.put(patient.getId(), patient);
                } catch (NumberFormatException e) {
                    System.out.println("error message: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return store;
    }
}
