import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class SessionTest {

  @Test
  void check_that_session_is_well_created() {
    LocalTime start = LocalTime.of(14, 0, 0);
    LocalTime end = LocalTime.of(16, 0, 0);

    Session test = new Session("math",start,end);

    Assertions.assertEquals(LocalTime.of(14, 0, 0), test.startAt());
    Assertions.assertEquals(LocalTime.of(16, 0, 0), test.endAt());
    // TODO: If I create a Session 'math' between 14:00 and 16:00, then It should start at 14:00 and finish at 16:00
  }

  @Test
  void check_that_session_is_well_created_even_if_I_swap_start_and_end() {
    LocalTime start = LocalTime.of(16, 0, 0);
    LocalTime end = LocalTime.of(14, 0, 0);

    Session test = new Session("math",start,end);

    Assertions.assertEquals(LocalTime.of(14, 0, 0), test.startAt());
    Assertions.assertEquals(LocalTime.of(16, 0, 0), test.endAt());
    // TODO: If I create a Session 'math' between 16:00 and 14:00, then It should start at 14:00 and finish at 16:00
  }
}
