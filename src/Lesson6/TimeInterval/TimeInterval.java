package Lesson6.TimeInterval;

public class TimeInterval {
    int sec;
    int min;
    int hour;

    public TimeInterval(int sec) {
        this.sec = sec;
    }

    public TimeInterval(int hour, int min, int sec) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public int getSec() {
        return this.hour * 3600 + this.min * 60 + this.sec;
    }

    public void compere(TimeInterval newTimeInterval) {
        if (this.getSec() > newTimeInterval.getSec()) {
            System.out.println("больше");
        } else if (this.getSec() == newTimeInterval.getSec()) {
            System.out.println("равно");
        } else {
            System.out.println("меньше");
        }

    }

    public String toString() {
        return "TimeInterval{sec=" + this.sec + ", min=" + this.min + ", hour=" + this.hour + "}";
    }
}

