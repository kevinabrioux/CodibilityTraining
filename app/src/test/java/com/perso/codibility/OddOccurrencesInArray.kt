package com.perso.codibility

import org.junit.Assert
import org.junit.Test

class OddOccurrencesInArray {


    fun solution(A: MutableList<Int>): Int {
        val sorted = A.sorted()
        for (index in 0 until sorted.size step 2){
            if(index+1 < sorted.size && sorted[index]  != sorted[index+1])
                return sorted[index]
        }
        return sorted.last()
    }

    /**
     *
    medium2
    medium random test n=100,003 ✘TIMEOUT ERROR
    running time: 4.944 sec., time limit: 0.208 sec.
    ▶ big1
    big random test n=999,999, multiple repetitions ✘TIMEOUT ERROR
    Killed. Hard limit reached: 6.000 sec.
    ▶ big2
    big random test n=999,999 ✘TIMEOUT ERROR
    Killed. Hard limit reached: 6.000 sec.
     */
    fun solutionList1(A: MutableList<Int>): Int {
       return A.first { value -> A.count { value == it } %2 == 1  }
    }

    //                       (3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 10)
    @Test
    fun test1() {
        val range: List<Int> = listOf(3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 3, 3, 9, 9, 9, 9, 10)
        Assert.assertEquals(10, this.solution(range.toMutableList()))
    }

    @Test
    fun test2() {
        val range = IntArray(500000000, { it })
        Assert.assertEquals(7, this.solution(range.toMutableList()))
    }
}