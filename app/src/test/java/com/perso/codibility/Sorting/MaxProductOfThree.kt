package com.perso.codibility.Sorting

import org.junit.Assert
import org.junit.Test

class MaxProductOfThree {

    /**
     * 100%
     * O(N * log(N))
     */
    fun solution(A: IntArray): Int {
        A.sort()
        val soluceOne = A.first() * A[1] * A.last()
        val soluceTwo = A[A.size - 3] * A[A.size - 2] * A.last()
        return Math.max(soluceOne, soluceTwo)
    }


    @Test
    fun test1() {
        val list = listOf(-3, 1, 2, -2, 5, 6).toIntArray()
        Assert.assertEquals(60, this.solution(list))
    }

    @Test
    fun test2() {
        val list = listOf(-3, -1, -2, -2, -5, -6).toIntArray()
        Assert.assertEquals(-4, this.solution(list))
    }

    @Test
    fun test3() {
        val list = listOf(-3, -1, 0).toIntArray()
        Assert.assertEquals(0, this.solution(list))
    }
}