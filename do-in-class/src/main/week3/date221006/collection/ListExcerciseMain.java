package main.week3.date221006.collection;

import java.util.List;

public class ListExcerciseMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();
        List<String> students = listExercise.getStudents();

        for (String student : students) {
            System.out.println(student);
        }
        System.out.println(students.size());
    }
}
