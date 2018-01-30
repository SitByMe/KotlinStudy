package prv.zohar.kotlinstudy.nestedClass

object Test9 {
    @JvmStatic
    fun main(args: Array<String>) {
        val d = OutClass().NestedClass().foo()
        println("d = $d")
    }
}