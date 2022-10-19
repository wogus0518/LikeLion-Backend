package main.week3.date221006.file.patient;

import java.util.HashMap;
import java.util.Set;

public class ReadPatientFileMain {
    public static void main(String[] args) {
        ReadPatientFile reader = new ReadPatientFile("8842height.phe.txt");
        HashMap<Integer, Patient> store = reader.readFile();
        System.out.println("store.size() = " + store.size());
        Set<Integer> keys = store.keySet();
        for (Integer key : keys) {
            Patient patient = store.get(key);
            System.out.printf("id = %d  hid=%s  height=%.1f \n",patient.getId(), patient.getHid(), patient.getHeight());
        }
    }
}
