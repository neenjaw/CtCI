import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromePermutationTest {
  @Test
  void countLetters() {
    int[] counts = new int[] { 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertArrayEquals(counts, PalindromePermutation.getLetterCounts("abbc"));
  }

  @Test
  void countLettersOutOfOrder() {
    int[] counts = new int[] { 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    assertArrayEquals(counts, PalindromePermutation.getLetterCounts("bcba"));
  }

  @Test
  void trueWhenPermutation() {
    assertTrue(PalindromePermutation.permutation("abbc", "abcb"));
  }

  @Test
  void falseWhenNotPermutation() {
    assertFalse(PalindromePermutation.permutation("abbc", "abcd"));
  }

  @Test
  void trueWhenEmpty() {
    assertTrue(PalindromePermutation.check("", ""));
  }

  @Test
  void trueWhenBlank() {
    assertTrue(PalindromePermutation.check(" ", " "));
  }

  @Test
  void trueWhenPalindromePermutation() {
    assertTrue(PalindromePermutation.check("ayy", "yay"));
  }

  @Test
  void trueWhenPalindromePermutationAndManyWord() {
    assertTrue(PalindromePermutation.check("Tact Coa", "taco cat"));
  }
}