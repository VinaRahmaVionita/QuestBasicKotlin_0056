package com.example.project1

fun uppercaseString(string: String): String {
    return string.uppercase()
}

//dapat di tulis dalam ekspresi lambda sbb :
fun main() {
    uppercaseString ("Hello")
    println ({string: String -> string.uppercase() }("hello"))
}