package com.perso.codibility.Lessons.Sorting

import org.junit.Assert
import org.junit.Test

class NumberOfDiscIntersections {

    fun solution(A: IntArray): Int {
        var count = 0
        val disks = mutableListOf<Disk>()
        A.forEachIndexed { index, value ->
            val disk = Disk(index, value)
            disks.forEach {
                count += if (disk.intersect(it)) {
                    1
                } else {
                    0
                }
            }
            disks.add(disk)
            if (count > 10000000)
                return -1
        }
        return count
    }

    @Test
    fun test1() {
        Assert.assertEquals(11, this.solution(listOf(1, 5, 2, 1, 4, 0).toIntArray()))
    }

    @Test
    fun test2() {
        Assert.assertEquals(0, this.solution(listOf<Int>().toIntArray()))
    }
}

class Disk(private val center: Int, radius: Int) {

    var left: Int = center - radius
    var right: Int = center + radius
    fun intersect(disk: Disk) = this.containPoint(disk.left)
            || this.containPoint(disk.right)
            || this.containPoint(disk.center)
            || disk.containPoint(this.left)
            || disk.containPoint(this.right)
            || disk.containPoint(this.center)


    private fun containPoint(point: Int) = point in left..right
}