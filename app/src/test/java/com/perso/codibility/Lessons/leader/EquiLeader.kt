package com.perso.codibility.Lessons.leader

import org.junit.Assert
import org.junit.Test

class EquiLeader {
    fun solution(A: IntArray): Int {
        var N = A.count() - 1
        A.forEachIndexed { S, i ->
            val A_0S = A.toList().subList(0, S)
            val A_SN = A.toList().subList(S, N)
            A_0S.forEach { value ->
                val leader1 = A_0S.count { it == value }
                val leader2 = A_SN.count { it == value }

            }

        }
        return 0
    }

    fun leaderForList(list: IntArray ): Int {
        var maxValue = list.first()
        var maxCount = 0
        val toto = IntArray(100000)
        list.forEach {
            if(maxCount < ++toto[it]){
                maxCount = toto[it]
                maxValue = it
            }
        }
        return maxValue
    }

    @Test
    fun testLeaderForList(){
        Assert.assertEquals(4, this.leaderForList(listOf(2, 2, 2, 4, 4, 2).toIntArray()))
    }


    fun test1() {
        Assert.assertEquals(2, this.solution(listOf(4, 3, 4, 4, 4, 2).toIntArray()))
    }
}