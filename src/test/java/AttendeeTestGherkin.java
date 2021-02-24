//import attendees.Attendee;
//import attendees.Session;
import org.junit.jupiter.api.Test;

public class AttendeeTestGherkin {

  @Test
  void test1() {
    during_the_math_lesson()
        .when_bob_is_connected_between("17:01", "17:59")
        .then_bob_spent_minutes_in_class(58);
  }

  @Test
  void test2() {
    during_the_math_lesson()
        .when_bob_is_connected_between("16:01", "16:59")
        .then_bob_spent_minutes_in_class(0);
  }

  @Test
  void test3() {
    during_the_math_lesson()
        .when_bob_is_connected_between("18:01", "18:59")
        .then_bob_spent_minutes_in_class(0);
  }

  @Test
  void test4() {
    // TODO : Given a session from 17h00 to 18h00, if Bob is connected from 17h10 to 17h20 and from 17h30 to 17h45, then he spent 25 minutes in class
  }

  @Test
  void test5() {
    // TODO : Given a session from 17h00 to 18h00, if Bob is connected from 17h30 to 18h45, then he spent 30 minutes in class
  }

  @Test
  void test6() {
    // TODO : Given a session from 17h00 to 18h00, if Bob is connected from 16h30 to 17h30, then he spent 25 minutes in class
  }

  @Test
  void test7() {
    // TODO : Given a session from 17h00 to 18h00, if Bob is connected from 17h30 to 18h00, then he was late
  }

  @Test
  void test8() {
    // TODO : Given a session from 17h00 to 18h00, if Bob is connected from 17h30 to 17h40, then he was absent
  }

  @Test
  void test9() {
    // TODO : Given a session from 17h00 to 18h00, if Bob was not connected at all, then he was absent
  }

  @Test
  void test10() {
    // TODO : Given a session from 17h00 to 18h00, if Bob is connected from 17h00 to 17h05 and from 17h55 and 18h00, then he was absent
  }


  private AttendeeTestHelper during_the_math_lesson() {
    return new AttendeeTestHelper();
  }
}

class AttendeeTestHelper {
  // TODO init bob
 // Attendee bob = null;
  // TODO init math that is a session between 17h00 and 18h00
  Session math = null;

  AttendeeTestHelper() {}

  public AttendeeTestHelper when_bob_didnt_attend_the_lesson() {
    return this;
  }

  AttendeeTestHelper when_bob_is_connected_between(String start, String end) {
    // TODO Create a Attendance according to the parameter and add it to this.bob
    return this;
  }

  AttendeeTestHelper and_between(String start, String end) {
    return when_bob_is_connected_between(start, end);
  }

  public AttendeeTestHelper then_bob_was_late() {
    // TODO Add an assertion validating that bob was late to the math session (call the method bob.wasLate(math) and check that the result is true)
    return this;
  }

  public AttendeeTestHelper then_bob_was_absent() {
    // TODO Add an assertion validating that bob was absent to the math session
    return this;
  }

  public AttendeeTestHelper then_bob_spent_minutes_in_class(int timeSpent) {
    // TODO Add an assertion validating that bob spent 'timeSpent' connected during the math session
    return this;
  }
}