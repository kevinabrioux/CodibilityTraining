package com.perso.codibility.CountingElements

import org.junit.Assert
import org.junit.Test

class MissingInteger {

    /**
     * 88%
     * O(N) or O(N * log(N))
     */
    fun solution(A: IntArray): Int {
        val sorted = A.filter { it > 0 }.sorted()
        if (sorted.isEmpty())
            return 1
        if (sorted[0] != 1)
            return 1
        sorted.forEachIndexed { index, value ->
            if (index + 1 == sorted.size)
                return value + 1
            if (sorted[index + 1] - value > 1)
                return value + 1
        }
        return sorted.last() + 1
    }


    @Test
    fun test9() {
        val range: List<Int> = listOf(4, 5, 6, 2)
        Assert.assertEquals(1, this.solution(range.toIntArray()))
    }

    @Test
    fun test1() {
        val range: List<Int> = listOf(1, 2, 3)
        Assert.assertEquals(4, this.solution(range.toIntArray()))
    }

    @Test
    fun test2() {
        val range: List<Int> = listOf(-1, -3)
        Assert.assertEquals(1, this.solution(range.toIntArray()))
    }

    @Test
    fun test3() {
        val range: List<Int> = listOf(1)
        Assert.assertEquals(2, this.solution(range.toIntArray()))
    }

    @Test
    fun test4() {
        val range: List<Int> = listOf(1, 2, 4)
        Assert.assertEquals(3, this.solution(range.toIntArray()))
    }

    @Test
    fun test5() {
        val range: List<Int> = listOf(1, 3, 6, 4, 1, 2)
        Assert.assertEquals(5, this.solution(range.toIntArray()))
    }

    @Test
    fun test6() {
        val range: List<Int> = listOf(1, 3, 6, 4, 1, 2, 5)
        Assert.assertEquals(7, this.solution(range.toIntArray()))
    }

    @Test
    fun test7() {
        val range: List<Int> = listOf(-1, 1, 3, 6, 4, 1, 2, 5, -8)
        Assert.assertEquals(7, this.solution(range.toIntArray()))
    }

    @Test
    fun test8() {
        val range: List<Int> = listOf(-1, 1, -8)
        Assert.assertEquals(2, this.solution(range.toIntArray()))
    }
}