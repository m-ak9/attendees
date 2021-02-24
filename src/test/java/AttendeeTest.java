import org.junit.jupiter.api.Test;

public class AttendeeTest {

  @Test
  void test1() {
    // TODO : Given a session from 17:00 to 18:00, if Bob is connected from 17:01 to 17:59, then he spent 58 minutes in class
  }

  @Test
  void test2() {
    // TODO : Given a session from 17h00 to 18h00, if Bob is connected from 16h01 to 16h59, then he spent 0 minutes in class
  }

  @Test
  void test3() {
    // TODO : Given a session from 17h00 to 18h00, if Bob is connected from 18h01 to 18h59, then he spent 58 minutes in class
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
}