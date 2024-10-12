package com.example.project1

fun nullSafety() {
    //never null has string type
    var neverNull: String = "this cant be null"

    //Throws a compiler error
    //neverNull = null

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"
    //this is ok
    nullable = null

    //check for null in conditions
    if (neverNull == null) {
        println("inferedNonNull id Null")
    }
    else {
        println("inferredNonNull is not null")
    }

    //safe call operator
    println(neverNull.length) //18
    println(nullable?.length) //null

    //not null dosent accpet null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull)) //18
}

fun main() {
    nullSafety()
}