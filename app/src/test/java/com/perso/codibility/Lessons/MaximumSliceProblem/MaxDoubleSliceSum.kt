package com.perso.codibility.Lessons.MaximumSliceProblem

import org.junit.Assert
import org.junit.Test

class MaxDoubleSliceSum {

    fun solution(A: IntArray): Int {
        var xValue = 11000
        var yValue = 11000
        var zValue = 11000
        var sum = 0
        A.forEachIndexed { index, value ->
            sum += value
            if (index > 0)
                when {
                    value < xValue -> {
                        xValue = value
                    }
                    value < yValue -> {
                        yValue = value
                    }
                    value < zValue -> {
                        zValue = value
                    }
                }
        }
        return sum - xValue - yValue - zValue
    }

    @Test
    fun test1() {
        Assert.assertEquals(17, this.solution(listOf(3, 2, 6, -1, 4, 5, -1, 2).toIntArray()))
    }
}