package com.perso.codibility.StacksQueues

import org.junit.Assert
import org.junit.Test

class Fish {
    fun solution(A: IntArray, B: IntArray): Int {
        val finalFishes = A.toMutableList()
        val order = B.toMutableList()
        A.forEachIndexed { index, fish ->
            if (B[index] != 0 && A.count() > index + 1 && B[index] != B[index + 1]) {
                if (fish != A[index + 1]) {
                    finalFishes.removeAt(index + 1)
                    order.removeAt(index + 1)
                } else {
                    finalFishes.removeAt(index)
                    order.removeAt(index)
                }
                return solution(finalFishes.toIntArray(), order.toIntArray())
            }
        }
        return finalFishes.count()
    }

    @Test
    fun test1() {
        Assert.assertEquals(2, this.solution(listOf(4, 3, 2, 1, 5).toIntArray(), listOf(0, 1, 0, 0, 0).toIntArray()))
    }

    @Test
    fun test2() {
        Assert.assertEquals(5, this.solution(listOf(4, 3, 2, 1, 5).toIntArray(), listOf(0, 1, 1, 1, 1).toIntArray()))
    }
    @Test
    fun test3() {
        Assert.assertEquals(2, this.solution(listOf(4, 3).toIntArray(), listOf(0, 1).toIntArray()))
    }

    @Test
    fun test4() {
        Assert.assertEquals(1, this.solution(listOf(4).toIntArray(), listOf(0).toIntArray()))
    }

    @Test
    fun test5() {
        Assert.assertEquals(1, this.solution(listOf(4).toIntArray(), listOf(1).toIntArray()))
    }

    @Test
    fun test6() {
        Assert.assertEquals(4, this.solution(listOf(4, 3, 2, 1, 5).toIntArray(), listOf(1, 0, 1, 1, 1).toIntArray()))
    }
}