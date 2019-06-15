package com.perso.codibility.Sorting

import org.junit.Assert
import org.junit.Test

class Distinct {


    fun solution(A: IntArray): Int {
        val distinctCount = mutableMapOf<Int, Int>()
        val distinctFinal = mutableMapOf<Int, Boolean>()
        A.forEach { value ->
            distinctCount[value]?.let {
                if (distinctCount[value] == 1)
                    distinctFinal.remove(value)
                distinctCount[value] = it + 1
            } ?: kotlin.run {
                distinctCount[value] = 1
                distinctFinal[value] = true
            }
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

}