package com.example.project1

class Motor()

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "Vina@gmail.com")
// Prints the value of the property: email println(contact.email)
    println(contact.email)


// Updates the value of the property: email contact.email = "jane@gmail.com"
    contact.email = "Rahma@gmail.com"

}
