package com.perso.codibility

import org.junit.Assert
import org.junit.Test

class FrogJmp {

    /**
     * result 100%
     * complexity : O(1)
     */
    fun solution(X: Int, Y: Int, D: Int) = Math.ceil((Y.toDouble() - X.toDouble()) / D.toDouble()).toInt()

    @Test
    fun test1() {
        Assert.assertEquals(this.solution(10, 85, 30), 3)
    }


}