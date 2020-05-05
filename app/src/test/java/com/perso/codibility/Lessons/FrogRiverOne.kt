package com.perso.codibility.Lessons

import org.junit.Assert
import org.junit.Test

class FrogRiverOne {

    /**
     * 100%
     * Complexity O(N)
     */
    fun solution(X: Int, A: IntArray): Int {
        var count = X
        val steps = BooleanArray(X) { false }
        A.forEachIndexed { index, value ->
            if (!steps[value - 1]) {
                steps[value - 1] = true
                count -= 1
            }
            if (count == 0) {
                return index
            }
        }
        return -1
    }

    @Test
    fun test1() {
        val list = listOf(1, 3, 1, 4, 2, 3, 5, 4).toIntArray()
        Assert.assertEquals(6, this.solution(5, list))
    }

    @Test
    fun test2() {
        val list = listOf(1).toIntArray()
        Assert.assertEquals(-1, this.solution(5, list))
    }

    @Test
    fun test3() {
        val list = listOf(1).toIntArray()
        Assert.assertEquals(0, this.solution(1, list))
    }

    @Test
    fun test4() {
        val list = listOf(1, 3, 1, 4, 2, 3, 5, 4, 7).toIntArray()
        Assert.assertEquals(-1, this.solution(7, list))
    }

    @Test
    fun test5() {
        val list = listOf(1, 6, 1, 4, 2, 3, 5, 4, 7).toIntArray()
        Assert.assertEquals(8, this.solution(7, list))
    }
}