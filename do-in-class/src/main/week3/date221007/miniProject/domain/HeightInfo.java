package main.week3.date221007.miniProject.domain;

public class HeightInfo {
    private final Integer height;
    private final Integer counts;

    public HeightInfo(Integer height, Integer counts) {
        this.height = height;
        this.counts = counts;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getCounts() {
        return counts;
    }
}
