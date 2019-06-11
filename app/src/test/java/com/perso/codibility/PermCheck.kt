package com.perso.codibility

import org.junit.Assert
import org.junit.Test

class PermCheck {
    /**
     * 100%
     * O(N) or O(N * log(N))
     */
    fun solution(A: IntArray): Int {
        val map = mutableMapOf<Int,Boolean>()
        var count = (A.size) * (A.size + 1) / 2
        A.forEach {
            if(map[it] == true) {
                return 0
            }
            map[it] = true
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

    @Test
    fun test3() {
        val list = listOf(1, 4, 1).toIntArray()
        Assert.assertEquals(0, this.solution(list))
    }
}