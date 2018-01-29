package prv.zohar.kotlinstudy.extended

object Test5_4 {
    //val C.laa: Int = 1//错误的，扩展属性不能有初始化器

    val <T> List<T>.lastIndex: Int
        get() = size - 1

    @JvmStatic
    fun main(args: Array<String>) {
        val strList = arrayListOf("John", "Jim", "Kitty")
        println("strList.lastIndex = " + strList.lastIndex)
    }
}