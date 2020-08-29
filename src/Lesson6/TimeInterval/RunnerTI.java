package Lesson6.TimeInterval;

public class RunnerTI {
    public static void main(String[] args) {
        TimeInterval ti = new TimeInterval(6, 20, 30);
        System.out.println(ti.getSec());
        TimeInterval newTimeInterval = new TimeInterval(888);
        newTimeInterval.compere(ti);
    }
}

