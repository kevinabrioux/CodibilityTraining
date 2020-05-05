package com.perso.codibility.Lessons

import org.junit.Assert
import org.junit.Test

class PermMissingElem {



    fun solution(A: IntArray): Int {
        var toto = (A.size + 1) * (A.size + 2) / 2
        A.forEach {
            toto -= it
        }
        return toto
    }

    @Test
    fun test1() {
        val list = listOf(2, 3, 1, 5).toIntArray()
        Assert.assertEquals(4, this.solution(list))
    }

    @Test
    fun test2(){
        val list = listOf(2).toIntArray()
        Assert.assertEquals(1, this.solution(list))
    }

    @Test
    fun createExtremSet(){
        val list = (1..100000).toList().toMutableList()
        list.removeAt(99997)
        Assert.assertEquals("", list.joinToString())
    }
}