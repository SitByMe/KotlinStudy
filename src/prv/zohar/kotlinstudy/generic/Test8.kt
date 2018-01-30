package prv.zohar.kotlinstudy.generic

object Test8 {
    @JvmStatic
    fun main(args: Array<String>) {
        var sBox: Box<String> = Box("a")
        var iBox = Box(1)

        var eBox = generic(3.0)

        doPrintln(2)
        doPrintln("is String")
        doPrintln(3.0)
    }

    fun <E> generic(e: E): E {
        return e
    }

    fun <T> doPrintln(t: T) {
        when (t) {
            is Int -> println(t % 10)
            is String -> println(t.toUpperCase())
            else -> println("t is neither Int nor String!")
        }
    }
}