public class Urlify {
  public static String urlify(String str) {
    char[] chars = str.toCharArray();

    boolean inWord = false;
    int insertTo = chars.length - 1;
    for (int i = chars.length - 1; i >= 0; i--) {
      char c = chars[i];
      if (!inWord && Character.isSpaceChar(c)) {
        continue;
      }

      if (Character.isSpaceChar(c)) {
        chars[insertTo] = '0';
        chars[insertTo - 1] = '2';
        chars[insertTo - 2] = '%';
        insertTo -= 3;
        continue;
      }

      inWord = true;
      chars[insertTo] = c;
      insertTo -= 1;
    }

    return String.valueOf(chars);
  }
}