package com.perso.codibility.Lessons.StacksQueues

import org.junit.Assert
import org.junit.Test

class Nesting {

    /**
     * 100%
     * O(N)
     */
    fun solution(S: String): Int {
        if (S.count() % 2 == 1)
            return 0
        var count = 0
        S.forEach {
            count += if (it == '(') {
                1
            } else {
                -1
            }
            if (count < 0)
                return 0
        }
        return if (count == 0) {
            1
        } else {
            0
        }
    }

    @Test
    fun test1() {
        Assert.assertEquals(1, this.solution("(()(())())"))
    }

    @Test
    fun test2() {
        Assert.assertEquals(0, this.solution(")(()(())()"))
    }

    @Test
    fun test3() {
        Assert.assertEquals(1, this.solution(""))
    }

    @Test
    fun test4() {
        Assert.assertEquals(0, this.solution("((("))
    }


    @Test
    fun test5() {
        Assert.assertEquals(0, this.solution("())"))
    }

}