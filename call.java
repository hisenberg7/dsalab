// Local Call Class
class LocalCall {
    private int duration; // in minutes

    public LocalCall(int duration) {
        this.duration = duration;
    }

    // 1 unit per 3 minutes
    public int calculateBill() {
        return (duration / 3) + ((duration % 3 != 0) ? 1 : 0);
    }
}

// Long Distance (STD) Call Class
class LongCall {
    private int duration;
    private String time;
    private int originCode, destCode;

    public LongCall(int duration, String time, int origin, int dest) {
        this.duration = duration;
        this.time = time;
        this.originCode = origin;
        this.destCode = dest;
    }

    // Simple rate calculation (example logic)
    public double calculateBill() {
        double rate;

        if (time.equalsIgnoreCase("day")) {
            rate = 2.0;
        } else {
            rate = 1.5;
        }

        return duration * rate;
    }
}

// Driver Class
public class call {
    public static void main(String[] args) {
        LocalCall local = new LocalCall(10);
        LongCall std = new LongCall(10, "day", 22, 44);

        System.out.println("Local Call Bill: " + local.calculateBill());
        System.out.println("STD Call Bill: " + std.calculateBill());
    }
}
