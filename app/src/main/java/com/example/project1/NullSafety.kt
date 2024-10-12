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

}