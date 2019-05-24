@file:JvmName("DisplayFunctions")

package rsk

fun main(args: Array<String>) {
    log(message = "Hello, World", logLevel = 2)
}

@JvmOverloads
fun log(message: String, logLevel: Int = 1) {
    println(message + logLevel)
}