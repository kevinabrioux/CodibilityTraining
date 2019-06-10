package com.perso.codibility

import org.junit.Assert
import org.junit.Test

class CyclicRotation {


    fun solution(A: IntArray, K: Int): IntArray = when {
        K == 0 || A.isEmpty() -> A
        else -> {
            val finalArray = A.toMutableList()
            finalArray.add(0, A.last())
            finalArray.removeAt(finalArray.lastIndex)
            solution(finalArray.toIntArray(), K - 1)
        }
    }

    @Test
    fun test1() {
        val range: List<Int> = listOf(3, 8, 9, 7, 6)
        Assert.assertEquals(
            listOf(9, 7, 6, 3, 8).toIntArray().joinToString(),
            this.solution(range.toIntArray(), 3).joinToString()
        )
    }

    @Test
    fun test2() {
        val range: List<Int> = listOf()
        Assert.assertEquals(
            emptyArray<Int>().toIntArray().joinToString(),
            this.solution(range.toIntArray(), 3).joinToString()
        )
    }



}