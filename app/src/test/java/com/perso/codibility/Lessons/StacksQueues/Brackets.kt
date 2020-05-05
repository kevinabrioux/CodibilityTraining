package com.perso.codibility.Lessons.StacksQueues

import org.junit.Assert
import org.junit.Test

class Brackets {


    /**
     * 100%
     * O(N)
     */
    fun solution(S: String): Int {
        val pipe = mutableListOf<Char>()
        if (S.count() > 200000 || S.count() % 2 == 1)
            return 0
        S.forEach { char ->
            when {
                char == '(' || char == '{' || char == '[' -> pipe.add(char)
                char == ')' && pipe.count() > 0 && pipe.last() == '(' -> pipe.removeAt(pipe.count() - 1)
                char == '}' && pipe.count() > 0 && pipe.last() == '{' -> pipe.removeAt(pipe.count() - 1)
                char == ']' && pipe.count() > 0 && pipe.last() == '[' -> pipe.removeAt(pipe.count() - 1)
                else -> return 0
            }
        }
        return if (pipe.count() == 0) {
            1
        } else {
            0
        }
    }

    @Test
    fun test1() {
        Assert.assertEquals(1, this.solution("{[()()]}"))
    }

    @Test
    fun test2() {
        Assert.assertEquals(0, this.solution("([)()]"))
    }

    @Test
    fun test3() {
        Assert.assertEquals(1, this.solution(""))
    }

    @Test
    fun test4() {
        Assert.assertEquals(0, this.solution(")("))
    }

    @Test
    fun test5() {
        Assert.assertEquals(0, this.solution("{{{{"))
    }

    @Test
    fun test6() {
        Assert.assertEquals(0, this.solution("]]]]]"))
    }

    @Test
    fun test7() {
        Assert.assertEquals(1, this.solution("({{({}[]{})}}[]{})"))
    }
}