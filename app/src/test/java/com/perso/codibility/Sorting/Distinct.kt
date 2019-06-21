package com.perso.codibility.Sorting

import org.junit.Assert
import org.junit.Test

class Distinct {


    /**
     * 100%
     * O(N*log(N)) or O(N)
     */
    fun solution(A: IntArray): Int {
        val distinctFinal = mutableMapOf<Int, Boolean>()
        A.forEach { value ->
            if (distinctFinal[value] == null)
                distinctFinal[value] = true
        }
        return distinctFinal.size
    }

    @Test
    fun test1() {
        Assert.assertEquals(3, this.solution(listOf(2, 1, 1, 2, 3, 1).toIntArray()))
    }

    @Test
    fun test2() {
        Assert.assertEquals(1, this.solution(listOf(2).toIntArray()))
    }

    @Test
    fun test3() {
        Assert.assertEquals(2, this.solution(listOf(-2, -3).toIntArray()))
    }

    @Test
    fun test4() {
        Assert.assertEquals(0, this.solution(listOf<Int>().toIntArray()))
    }

    @Test
    fun test5() {
        Assert.assertEquals(1, this.solution(listOf(-1000000).toIntArray()))
    }

    @Test
    fun test6() {
        Assert.assertEquals(1, this.solution(listOf(1000000).toIntArray()))
    }

}