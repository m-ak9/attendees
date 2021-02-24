import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;

public class Attendee {


    private String                name;
    private ArrayList<Attendance> teamsConnexions;

    public Attendee(String name, ArrayList<Attendance> teamsConnexions) {
        this.name = name;
        this.teamsConnexions = teamsConnexions;
    }

    public LocalTime timeSpent(Session session) {
        LocalTime result;

        int res = 0;

        for (Attendance attendance: this.teamsConnexions) {
            res += attendance.calculateDurationOfConnexion().getSecond();
        }

        result = LocalTime.ofSecondOfDay(res);

        return result;

    }


}
