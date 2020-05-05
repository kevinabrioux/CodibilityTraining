package com.perso.codibility.Lessons.StacksQueues

import org.junit.Assert
import org.junit.Test

class StoneWall {

    fun solution(H: IntArray): Int {
        val cubes = mutableListOf<Int>()
        val pyramid = mutableListOf<Int>()
        H.forEach { height ->
            if (cubes.isEmpty()) {
                cubes.add(height)
            } else if (cubes.last() > height) {
                if (!pyramid.isEmpty())
                    pyramid.removeAt(pyramid.count() - 1)
                if(pyramid.last() == height){

                }else{

                }
                cubes.add(height)

                pyramid.add(height)
            } else if (cubes.last() < height) {
                pyramid.add(height)
                cubes.add(height)
            }
        }
        return cubes.count()
    }

    @Test
    fun test1() {
        Assert.assertEquals(7, this.solution(listOf(8, 8, 5, 7, 9, 8, 7, 4, 8).toIntArray()))
    }
}