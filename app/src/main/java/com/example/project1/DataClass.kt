package com.example.project1

data class DataClass(
    val id: Int,
    var email: String
)

fun main() {
    val data = DataClass(1, "Vina@gmail.com")
    println(data)

    //fungsi equals
    val data2 = DataClass(1, "Rahma@gmail.com")
    println(data == data2) //false
}
