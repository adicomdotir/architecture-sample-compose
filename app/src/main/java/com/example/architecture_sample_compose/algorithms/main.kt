package com.example.architecture_sample_compose.algorithms

fun main() {
    val myWords = listOf("sall=am", "testtwoo===wo")
    myWords.forEach { word ->
        println(cleanWord(word))
    }
}

fun cleanWord(word: String): String {
    val newWord = mutableListOf<Char>()
    word.forEach { ch ->
        if (ch != '=') {
            newWord.add(0, ch)
        } else {
            newWord.removeAt(0)
        }
    }
    newWord.reverse()
    return newWord.joinToString()
}
