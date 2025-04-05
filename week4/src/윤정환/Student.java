package 윤정환;

public class Student {
    public String name;
    public int ban;
    public int no;
    public int kor;
    public int eng;
    public int math;

    public int getTotal() {
        return kor + eng + math;
    }

    public float getAverage() {
        return Math.round((float) getTotal() / 3 * 10) / 10.0f;
    }
}
