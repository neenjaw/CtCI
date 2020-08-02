import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class WordTest {

  @Test
  fun `returns true`() {
    assertTrue(getTrue())
  }

  @Test
  fun `blank are close`() {
    assertTrue(differentByOneOrLess("", ""))
  }

  @Test
  fun `same are close`() {
    assertTrue(differentByOneOrLess("same", "same"))
  }

  @Test
  fun `different first letter are close`() {
    assertTrue(differentByOneOrLess("same", "lame"))
  }

  @Test
  fun `different middle letter are close`() {
    assertTrue(differentByOneOrLess("same", "sane"))
  }

  @Test
  fun `less a last letter are close`() {
    assertTrue(differentByOneOrLess("names", "name"))
  }

  @Test
  fun `add a last letter are close`() {
    assertTrue(differentByOneOrLess("name", "names"))
  }

  @Test
  fun `less a middle letter are close`() {
    assertTrue(differentByOneOrLess("plane", "pane"))
  }

  @Test
  fun `add a middle letter are close`() {
    assertTrue(differentByOneOrLess("pane", "plane"))
  }
}
