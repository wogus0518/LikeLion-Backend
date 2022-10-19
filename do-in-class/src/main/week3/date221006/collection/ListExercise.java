package main.week3.date221006.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;

    public ListExercise() {
        students = new ArrayList<>();
        students.add("홍길동1");
        students.add("홍길동2");
        students.add("홍길동3");
        students.add("홍길동4");
        students.add("홍길동5");
    }

    public List<String> getStudents() {
        return students;
    }
}
