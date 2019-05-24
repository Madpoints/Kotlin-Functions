@file:JvmName("DisplayFunctions")

package rsk

fun main(args: Array<String>) {
    display("Hello, World")
}

fun display(message:String) : Boolean {
    println(message)
    return true
}