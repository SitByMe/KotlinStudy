package prv.zohar.kotlinstudy.basic

object KBasicType {

    var b: Byte = 1.toByte()
    var s: Short = 1
    var i: Int = 1
    var l: Long = 1L
    var f: Float = 1.1f
    var d: Double = 1.1
    var c: Char = 'c'
    var bool: Boolean = true


    val text = """
        |All endings are beginnings,
        |we just don't know it at the time.
        |-Mitch Albom
        """.trimMargin("|")

    @JvmStatic fun main(args: Array<String>) {

//        println(decimalDigitValue(c))
//        println(decimalDigitValue('2'))

//        traverseStr("Hello Kotlin!")
//        traverseStr(text)

        strTemplate();
    }

    fun decimalDigitValue(c: Char): Int {
        if (c in '0'..'9')
            return c.toInt()
        return -1
    }

    fun traverseStr(str: String) {
        for (c in str) {
            print(c)
        }
    }

    fun strTemplate() {
        val i = 1
        val si = "i = $i"

        val str = "abc"
        val sstr = "$str.length = ${str.length}"

        println(si)
        println(sstr)

        val price = """
        >${'$'}9.99
        """.trimMargin(">")
        println(price)
    }
}