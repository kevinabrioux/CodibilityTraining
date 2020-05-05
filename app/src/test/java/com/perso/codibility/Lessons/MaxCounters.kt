package com.perso.codibility.Lessons

import org.junit.Assert
import org.junit.Test

class MaxCounters {

    /**
     * 88%
     * O(N + M)
     */
    fun solution(N: Int, A: IntArray): IntArray {
        var max = 0
        var finalCounters = IntArray(N) { 0 }
        A.forEach { X ->
            if (X in 1..N) {
                finalCounters[X - 1] += 1
                max = Math.max(max, finalCounters[X - 1])
            } else if (X == (N + 1)) {
                finalCounters = IntArray(N) { max }
            }
        }
        return finalCounters
    }


    @Test
    fun test1() {
        val list = listOf(3, 4, 4, 6, 1, 4, 4).toIntArray()
        Assert.assertEquals(listOf(3, 2, 2, 4, 2).joinToString(), this.solution(5, list).joinToString())
    }

    @Test
    fun test2() {
        val list = listOf(3).toIntArray()
        Assert.assertEquals(listOf(0, 0, 1, 0, 0).joinToString(), this.solution(5, list).joinToString())
    }
}