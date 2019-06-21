package com.perso.codibility.Sorting

import org.junit.Assert
import org.junit.Test

class Circle {
    fun solution(A: IntArray): Int {
        var count = 0
        val circles = mutableListOf<Pair<Double, Double>>()
        A.forEachIndexed { J, radius ->
            val circleRef = Pair(J.toDouble() - radius.toDouble(), J.toDouble() + radius.toDouble())
            circles.forEach { circleToCompare ->
                if ((circleRef.first >= circleToCompare.first && circleRef.second >= circleToCompare.second)
                    || (circleRef.first <= circleToCompare.first && circleRef.second >= circleToCompare.second)
                )
                    count++
                if (count > 10000000)
                    return -1
            }
            circles.add(circleRef)
        }
        return count
    }

    @Test
    fun test1() {
        Assert.assertEquals(11, this.solution(listOf(1, 5, 2, 1, 4, 0).toIntArray()))
    }

    @Test
    fun test2() {
        Assert.assertEquals(0, this.solution(listOf<Int>().toIntArray()))
    }

    @Test
    fun test3() {
        Assert.assertEquals(0, this.solution(listOf(1).toIntArray()))
    }
}