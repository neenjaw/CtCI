fun getTrue(): Boolean {
  return true
}

fun differentByOneOrLess(word: String, edit: String): Boolean {
  val wordLetters = word.toList()
  val editLetters = edit.toList()

  return doDifferent(wordLetters, editLetters)
}

private fun doDifferent(wordLetters: List<Char>, editLetters: List<Char>, edited: Boolean = false): Boolean {
  // Basecases
  if (wordLetters.isEmpty() && editLetters.isEmpty()) {
    return true
  }

  if (!edited && wordLetters.isEmpty() && editLetters.size == 1) {
    return true
  }

  if (!edited && editLetters.isEmpty() && wordLetters.size == 1) {
    return true
  }

  if (wordLetters.isEmpty() || editLetters.isEmpty()) {
    return false
  }

  val wFirst = wordLetters.first()
  val eFirst = editLetters.first()

  if (wFirst == eFirst) {
    return doDifferent(wordLetters.drop(1), editLetters.drop(1), edited)
  }

  // First letters must be different
  if (edited) {
    return false
  } else {
    return doDifferent(wordLetters.drop(1), editLetters, true)
           || doDifferent(wordLetters, editLetters.drop(1), true)
           || doDifferent(wordLetters.drop(1), editLetters.drop(1), true)
  }
}
