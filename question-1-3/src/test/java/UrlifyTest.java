import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UrlifyTest {
  @Test
  void replacesNothingWhenGivenNothing() {
    assertEquals("", Urlify.urlify(""));
  }

  @Test
  void replacesNothingWhenNoSpaces() {
    assertEquals("a", Urlify.urlify("a"));
  }

  @Test
  void replacesSpaceInBetweenWords() {
    assertEquals("a%20b", Urlify.urlify("a b  "));
  }

  @Test
  void replacesSpaceInBetweenManyWords() {
    assertEquals("a%20b%20c", Urlify.urlify("a b c    "));
  }
}