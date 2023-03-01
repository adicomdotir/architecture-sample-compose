package com.example.architecture_sample_compose

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val myWords = listOf("sall=am", "testtwoo===wo")
        myWords.forEach { word ->
            println(word)
        }
    }
}