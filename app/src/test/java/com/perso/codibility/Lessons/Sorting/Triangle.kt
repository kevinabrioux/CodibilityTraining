package com.perso.codibility.Lessons.Sorting

import org.junit.Assert
import org.junit.Test

class Triangle {


    fun solution(A: IntArray): Int {
        for (P in 0 until A.size) {
            for (Q in P + 1 until A.size) {
                for (R in Q + 1 until A.size) {
                    if ((A[P] + A[Q]) > A[R] && (A[P] + A[R]) > A[Q] && (A[R] + A[Q]) > A[P])
                        return 1
                }
            }
        }
        return 0
    }

    @Test
    fun test1() {
        val list = listOf(10, 2, 5, 1, 8, 20).toIntArray()
        Assert.assertEquals(1, this.solution(list))
    }

    @Test
    fun test2() {
        val list = listOf(10).toIntArray()
        Assert.assertEquals(0, this.solution(list))
    }

    @Test
    fun test3() {
        val list = listOf<Int>().toIntArray()
        Assert.assertEquals(0, this.solution(list))
    }

    @Test
    fun test4() {
        val list = listOf(5,3,3).toIntArray()
        Assert.assertEquals(1, this.solution(list))
    }

    @Test
    fun test5() {
        val list = listOf(-5,-3,-3).toIntArray()
        Assert.assertEquals(0, this.solution(list))
    }
}