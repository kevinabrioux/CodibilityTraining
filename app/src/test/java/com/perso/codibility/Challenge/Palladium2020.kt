package com.perso.codibility.Challenge

import org.junit.Assert
import org.junit.Test

class Palladium2020 {


    fun solution(H: IntArray): Int {
        var count = 0
        var currentTop = 0
        H.forEachIndexed { index, value ->
            when {
                index + 1 >= H.size -> count += value
                value >= H[index + 1] -> {
                    count += value
                    currentTop = value
                }
                value < H[index + 1] -> count += currentTop
            }

        }
        return count
    }

    @Test
    fun test1() {
        Assert.assertEquals(10, this.solution(listOf(3, 1, 4).toIntArray()))
    }

    @Test
    fun test2() {
        Assert.assertEquals(19, this.solution(listOf(5, 3, 2, 4).toIntArray()))
    }
}