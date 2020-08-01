public class PalindromePermutation {
  public static boolean check(String input, String test) {
    input = input.toLowerCase();
    test = test.toLowerCase();

    if (!permutation(input, test)) {
      return false;
    }

    int frontIndex = 0, backIndex = test.length() - 1;
    char[] testChars = test.toCharArray();
    while (frontIndex < backIndex) {
      if (testChars[frontIndex] == ' ') {
        frontIndex += 1;
        continue;
      }
      if (testChars[backIndex] == ' ') {
        backIndex -= 1;
        continue;
      }

      if (testChars[frontIndex] != testChars[backIndex]) {
        return false;
      }

      frontIndex += 1;
      backIndex -= 1;
    }

    return true;
  }

  public static int[] getLetterCounts(String input) {
    int[] counts = new int[26];

    int offset = Character.getNumericValue('a');
    for (char c : input.toCharArray()) {
      if (Character.isLetter(c) && Character.isLowerCase(c)) {
        int idx = Character.getNumericValue(c) - offset;
        counts[idx] += 1;
      }
    }

    return counts;
  }

  public static boolean permutation(String input, String test) {
    int[] counts = getLetterCounts(input);
    int offset = Character.getNumericValue('a');
    for (char c : test.toCharArray()) {
      if (Character.isLetter(c) && Character.isLowerCase(c)) {
        int idx = Character.getNumericValue(c) - offset;
        counts[idx] -= 1;
      }
    }

    for (int count : counts) {
      if (count != 0) {
        return false;
      }
    }

    return true;
  }
}