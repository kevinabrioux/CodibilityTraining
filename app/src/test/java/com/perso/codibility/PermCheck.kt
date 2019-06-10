package com.perso.codibility

import org.junit.Assert
import org.junit.Test

class PermCheck {
    fun solution(A: IntArray): Int {
        var count = (A.size) * (A.size + 1) / 2
        A.forEach {
            count -= it
        }
        return if (count == 0) {
            1
        } else {
            0
        }
    }

    @Test
    fun test1() {
        val list = listOf(4, 1, 3, 2).toIntArray()
        Assert.assertEquals(1, this.solution(list))
    }

    @Test
    fun test2() {
        val list = listOf(1, 4, 1).toIntArray()
        Assert.assertEquals(0, this.solution(list))
    }
}