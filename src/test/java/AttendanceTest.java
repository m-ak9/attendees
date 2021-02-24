import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class AttendanceTest {
  @Test
  void test1() {

    LocalTime start = LocalTime.of(14, 0, 0);
    LocalTime end = LocalTime.of(15, 30, 0);

    Attendance test = new Attendance(start,end);

    Assertions.assertEquals(LocalTime.of(1,30), test.calculateDurationOfConnexion());

    // TODO : The duration of an attendance starting at 14:00 and finishing at 15:30 should be 90 minutes
  }

  @Test
  void test2() {

    LocalTime start = LocalTime.of(16, 0, 0);
    LocalTime end = LocalTime.of(15, 30, 0);

    Attendance test = new Attendance(start,end);

    Assertions.assertEquals(LocalTime.of(0,0), test.calculateDurationOfConnexion());
    // TODO : The duration of an attendance starting at 16:00 and finishing at 15:30 should be 0 minutes
  }

  @Test
  void test3() {
    LocalTime start = LocalTime.of(14, 30, 0);
    LocalTime end = LocalTime.of(15, 30, 0);
    Attendance test = new Attendance(start,end);

    LocalTime startSession = LocalTime.of(14, 0, 0);
    LocalTime endSession = LocalTime.of(15, 0, 0);
    Session testSession = new Session("math",startSession,endSession);

    Assertions.assertEquals(LocalTime.of(14,30), test.bounded(testSession).getStartConnexion());
    Assertions.assertEquals(LocalTime.of(15,0), test.bounded(testSession).getEndConnexion());
    // TODO : If I bound an attendance from 14h30 to 15h30 with a session from 14h00 to 15h00, then I should get a new Attendance between 14h30 and 15h00
  }
}
