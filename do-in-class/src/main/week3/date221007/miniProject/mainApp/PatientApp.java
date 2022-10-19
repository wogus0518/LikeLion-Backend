package main.week3.date221007.miniProject.mainApp;

import main.week3.date221007.miniProject.context.ReadLineContext;
import main.week3.date221007.miniProject.context.WriterContext;
import main.week3.date221007.miniProject.domain.Patient;
import main.week3.date221007.miniProject.parser.PatientParser;

import java.io.IOException;
import java.util.*;

public class PatientApp {

    public static void main(String[] args) throws IOException {
        //파일을 읽어서 Patient 인스턴스 배열로 반환받는다.
        ReadLineContext<Patient> readLineContext = new ReadLineContext<>(new PatientParser());
        final String filename = "8842height.phe.txt";
        List<Patient> patients = readLineContext.readByLine(filename);

        //Patient.height 정보를 이용해 heightMap을 만든다. (key=height, value=같은 키 사람 수)
        HashMap<Integer, Integer> heightMap = getCountHeightMap(patients);

        //key,value 형식으로 텍스트 파일을 만들어 저장한다.
        saveFile(heightMap);
    }

    //key,value 형식으로 텍스트 파일을 만들어 저장한다.
    private static void saveFile(HashMap<Integer, Integer> heightMap) {
        Set<Integer> keys = heightMap.keySet();
        List<String> strs = new ArrayList<>();
        for (Integer key : keys) {
            String str = key + "," + heightMap.get(key) + "\n";
            strs.add(str);
        }
        WriterContext writer = new WriterContext();
        writer.write(strs, "patient_height_statistics.txt");
    }

    //Patient.height 정보를 이용해 heightMap을 만든다. (key=height, value=같은 키 사람 수)
    private static HashMap<Integer, Integer> getCountHeightMap(List<Patient> patients) {
        HashMap<Integer, Integer> heightMap = new HashMap<>();
        int height;
        for (Patient patient : patients) {
            if( (height = (int)Math.round(patient.getHeight())) == 0 ) continue;
            heightMap.putIfAbsent(height, 1);
            heightMap.put(height, heightMap.get(height) + 1);
        }
        return heightMap;
    }
}


//        Map<Integer, Patient> patientMap = new HashMap<>();
//        for (Patient patient : patients) {
//            patientMap.put(patient.getId(), patient);
//        }
//
//        Iterator<Integer> iterator = patientMap.keySet().iterator();
//        while (iterator.hasNext()) {
//            Patient patient = patientMap.get(iterator.next());
//            if (patient.getId() == 0) {
//                continue;
//            }
//            System.out.printf("id = %d  hid = %s  height = %.1f\n", patient.getId(), patient.getHid(), patient.getHeight());
//        }

