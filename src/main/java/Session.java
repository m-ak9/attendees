import java.time.LocalTime;

public class Session {

    private String name;
    private LocalTime start;
    private LocalTime end;

    public Session(String name, LocalTime start, LocalTime end) {
        this.name = name;
        this.start = start;
        this.end = end;
        checkDate();
    }

    public LocalTime startAt() {
        return this.start;
    }

    public LocalTime endAt() {
        return this.end;
    }

    private void checkDate() {
        LocalTime provisory;

        if (this.start.isAfter(this.end)){
            provisory = this.start;
            this.start = this.end;
            this.end = provisory;
        }
    }
}
