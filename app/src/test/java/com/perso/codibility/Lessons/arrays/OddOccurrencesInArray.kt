package com.perso.codibility.Lessons.arrays

import org.junit.Assert
import org.junit.Test



class OddOccurrencesInArray {


    //Before
    fun solution1(A: IntArray): Int {
        val sorted = A.sorted()
        for (index in sorted.indices step 2){
            if(index+1 < sorted.size && sorted[index]  != sorted[index+1])
                return sorted[index]
        }
        return sorted.last()
    }

    //100%
    fun solution(A: IntArray): Int {
        if (A.count() == 0)
            return 0

        var unpaired: Int = 0

        A.forEach {
            val previousUnpaired = unpaired
            unpaired = unpaired xor it
            print("")
        }

        return unpaired

    }

    //                       (3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 10)
    @Test
    fun test1() {
        val range: List<Int> = listOf(3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 10)
        Assert.assertEquals(10, this.solution(range.toIntArray()))
    }

    @Test
    fun test3(){
        val range = listOf(9,3,9,3,9,7,9).toIntArray()
        Assert.assertEquals(7, this.solution(range))
    }

    @Test
    fun test2(){
        val range = listOf(5,9,3,9,3,9,9).toIntArray()
        Assert.assertEquals(5, this.solution(range))
    }
}