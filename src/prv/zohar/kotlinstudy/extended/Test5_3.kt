package prv.zohar.kotlinstudy.extended

object Test5_3 {
    @JvmStatic
    fun main(args: Array<String>) {
        var c: C? = null
        println(c.toString())
        c = C("Json", 18)
        println(c.toString())
    }

    fun Any?.toString(): String {
        if (this == null) return "null"
        return this.toString()
    }
}