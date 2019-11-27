package main

class Example {
    var id: Int by StorageDelegate("id", 20)
}

fun main(args: Array<String>) {
    val e = Example()
    println(e.id)
    e.id = 5
    println(e.id)
}
