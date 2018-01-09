package prv.zohar.kotlinstudy.classesandobjects

interface Play {
    val num: Int//抽象的
    val numStr: String
        get() = num.toString()

    fun look()
    fun say() {
        println("Play.say()")
    }
}