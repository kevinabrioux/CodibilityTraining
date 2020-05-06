package com.perso.codibility.Lessons.PrimeComposite

import org.junit.Assert
import org.junit.Test
import kotlin.math.sign

class Flags {


    fun solution(A: IntArray): Int {
        val peaks = mutableListOf<Int>()
        A.forEachIndexed { index, value ->
            if (index > 0 && index < A.size && value > A[index - 1] && value > A[index + 1]) {
                peaks.add(index)

            }
        }
        var flagNumber = peaks.size
        while (flagNumber > 0) {
            var remainingPeak = peaks.size
            for (index in 0 until peaks.size) {
                val gap = peaks[index + 1] - peaks[index]
                if (flagNumber > gap) {
                    remainingPeak--
                    if (remainingPeak < flagNumber)
                        break
                }
            }
            flagNumber--
        }

        return 0
    }

    @Test
    fun test1() {
        Assert.assertEquals(3, listOf(1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2).toIntArray())


    }
}