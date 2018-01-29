package prv.zohar.kotlinstudy.extended

object Test5_1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val intList = mutableListOf(1, 2, 3)
        println(intList)
        intList.swap(0, 2)
        println(intList)
        println("-------------------")
        val strList = mutableListOf("str1", "str2", "str3")
        println(strList)
        strList.swap(0, 2)
        println(strList)
    }

    fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
        val tmp = this[index1]
        this[index1] = this[index2]
        this[index2] = tmp
    }
}