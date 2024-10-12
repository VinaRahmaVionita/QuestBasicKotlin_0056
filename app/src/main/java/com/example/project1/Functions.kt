package com.example.project1

fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello, World")
}

fun withParameter(name: String) {
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

//named argumen
//merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age:Int){
    println()
    println("== withNamedArgument ==")
    println("hello, $name! You are $age years old.")
}


