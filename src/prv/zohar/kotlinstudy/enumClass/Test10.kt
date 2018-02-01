package prv.zohar.kotlinstudy.enumClass

object Test10 {
    @JvmStatic
    fun main(args: Array<String>) {
        val colors = Color.values()

        printAllValues<Color>()
        println(enumValueOf<Color>("BLUE"))
        for (color in enumValues<Color>()) {
            println(color.name + " --- " + color.ordinal)
        }
    }

    inline fun <reified T : Enum<T>> printAllValues() {
        println(enumValues<T>().joinToString { it.name })
    }
}