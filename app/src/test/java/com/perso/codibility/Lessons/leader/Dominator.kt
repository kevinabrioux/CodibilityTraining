package com.perso.codibility.Lessons.leader

import org.junit.Assert
import org.junit.Test

class Dominator {

    fun solution(A: IntArray): Int {
        val count = A.count()
        var filtered = mutableListOf<Int>()
        var filteredCount = 0
        var index = 0
        for(element in A){
            if(element in filtered){

            }else if(count/2 < index || filteredCount > count/2)
                return -1
            else {
                val elementCount = A.count { it == element }
                if(count/2 < elementCount)
                    return index
                else {
                    filtered.add(element)
                    filteredCount += elementCount
                }
            }
            index++
        }
        return -1
    }

    @Test
    fun test1(){
        val array = listOf(3,4,3,2,3,-1,3,3).toIntArray()
        Assert.assertEquals(0, this.solution(array))
    }

    @Test
    fun test2(){
        val array = listOf(1,2,3,4).toIntArray()
        Assert.assertEquals(-1, this.solution(array))
    }

    @Test
    fun test3(){
        val array = listOf(1,2).toIntArray()
        Assert.assertEquals(-1, this.solution(array))
    }
}