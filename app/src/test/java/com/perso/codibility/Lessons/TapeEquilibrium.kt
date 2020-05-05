package com.perso.codibility.Lessons

import org.junit.Assert
import org.junit.Test

class TapeEquilibrium {

    /**
     * 100%
     * O(N)
     */
    fun solution(A: IntArray): Int {
        var p1 = 0
        var p2 = 0
        A.forEach { p2 += it }
        var minimum = Int.MAX_VALUE
        A.forEachIndexed { index, value ->
            p2 -= value
            p1 += value
            if (Math.abs(p1 - p2) < minimum && index < A.size - 1)
                minimum = Math.abs(p1 - p2)
        }
        return minimum
    }

    @Test
    fun test1() {
        val list = listOf(3, 1, 2, 4, 3).toIntArray()
        Assert.assertEquals(7, this.solution(list))
    }

    @Test
    fun test2() {
        val list = listOf(3, 1).toIntArray()
        Assert.assertEquals(2, this.solution(list))
    }

    @Test
    fun test3(){
        val list = listOf(-1000,1000).toIntArray()
        Assert.assertEquals(2000, this.solution(list))
    }
}