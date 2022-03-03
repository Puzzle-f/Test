package com.example.test

import android.util.Log

data class DellClass(val name: String, val age: Int) {

    override fun equals(other: Any?): Boolean {
       return (other is DellClass)&& name==other.name&& age==other.age
    }
}

val del1 = DellClass("Petro", 43)
val del2 = DellClass("Semen", 20)
val del3 = DellClass("Semen", 20)
val del4 = null
val del5 = del1

fun eq(): Boolean{
    return del1.equals(del2)
//    return v1.equals(v2)
}