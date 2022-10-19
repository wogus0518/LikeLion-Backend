package main.week3.date221007.miniProject.parser;

import main.week3.date221007.miniProject.domain.Patient;
import main.week3.date221007.miniProject.context.Parser;

import java.util.StringTokenizer;

public class PatientParser implements Parser<Patient> {
    @Override
    public Patient parse(String str) {
        StringTokenizer st = new StringTokenizer(str, "\t");
        try {
            int id = Integer.parseInt(st.nextToken());
            String hid = st.nextToken();
            double height = Double.parseDouble(st.nextToken());
            return new Patient(id, hid, height);
        } catch (NumberFormatException e) {
            return new Patient(0, "", 0.0);
        }
    }
}
