package main.week3.date221006.file.patient;

public class Patient {
    private final int id;
    private final String hid;
    private final double height;

    public Patient(int id, String hid, double height) {
        this.id = id;
        this.hid = hid;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public String getHid() {
        return hid;
    }

    public double getHeight() {
        return height;
    }
}
