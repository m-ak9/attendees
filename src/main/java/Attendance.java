import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Attendance {

    private LocalTime startConnexion;
    private LocalTime endConnexion;


    public Attendance(LocalTime startConnexion, LocalTime endConnexion) {
        this.startConnexion = startConnexion;
        this.endConnexion = endConnexion;
    }

    public LocalTime calculateDurationOfConnexion() {
        LocalTime amount = this.startConnexion;
        long      res    = amount.until(this.endConnexion, ChronoUnit.SECONDS);

        if (res < 0) {
            res = 0;
        }

        return LocalTime.ofSecondOfDay(res);
    }

    public Attendance bounded(Session session){

        Attendance toreturn = new Attendance(this.startConnexion,this.endConnexion);

        if (toreturn.startConnexion.isBefore(session.startAt())){
            toreturn.startConnexion = session.startAt();
        } else if (toreturn.endConnexion.isAfter(session.endAt())){
            toreturn.endConnexion = session.endAt();
        }

        return toreturn;
    }

    @Override
    public boolean equals(Object other){
        Attendance otherAttendence = (Attendance) other;

        if (this.startConnexion.equals(otherAttendence.getStartConnexion()) && this.endConnexion.equals(otherAttendence.getEndConnexion())) {
            return true;
        } else {
        return false;
        }
    }

    public LocalTime getStartConnexion() {
        return startConnexion;
    }

    public LocalTime getEndConnexion() {
        return endConnexion;
    }

}
