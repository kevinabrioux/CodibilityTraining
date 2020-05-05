package com.perso.codibility.Lessons.prefixSum

import org.junit.Assert
import org.junit.Test

class CountDiv {


    /**
     * 50%
     */
    fun solution(A: Int, B: Int, K: Int): Int {
        var count = 0
        (A..B).forEach {
            if(it%K == 0){
                count++
            }
        }
        return count
    }


    @Test
    fun test1() {
        Assert.assertEquals(3, this.solution(6, 11, 2))
    }

    @Test
    fun test2() {
        Assert.assertEquals(11, this.solution(0, 20, 2))
    }

    @Test
    fun test3() {
        Assert.assertEquals(16, this.solution(0, 30, 2))
    }
}