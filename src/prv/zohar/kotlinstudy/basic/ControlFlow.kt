package prv.zohar.kotlinstudy.basic

object ControlFlow {

    const val cstr: String = "const_str"
    @Deprecated(cstr) fun foo() {}

    @JvmStatic fun main(args: Array<String>) {

//        func_if()

//        func_when1(1)
//        func_when1(3)
//        func_when1(8)
//        func_when1(13)
//        func_when1(26)

//        func_when2(1)
//        func_when2("s")
//        func_when2(1.1)

//        func_when3(5)
//        func_when3(15)

//        func_for()

        func_while()
    }

    fun func_if() {
        val a = 1
        val b = 2

        //传统用法
        var max1 = a
        if (a < b) max1 = b

        //with else
        var max2: Int
        if (a > b) {
            max2 = a
        } else {
            max2 = b
        }

        //作为表达式
        val max3 = if (a > b) a else b
        //if的分支可以是代码块，最后的表达式作为该块的值
        val max4 = if (a > b) {
            a
        } else {
            b
        }
    }

    fun func_when1(x: Int) {
        val validNumbers = intArrayOf(11, 12, 13, 14)
        when (x) {
            1 -> println("x = 1")//判断x是否为1
            2, 3 -> println("x = 2 or x = 3")//判断x是否为2或3
            in 4..10 -> println("x is between 4 and 10")//判断x是否在4至10之间（闭区间）
            in validNumbers -> println("x is in validNumbers")//判断x是否在validNumbers这个集合中
            else -> {
                println("x: otherwise")
            }
        }
    }

    fun func_when2(x: Any) {
        when (x) {
            is String -> println("$x is String")
            is Double -> println("$x is Double")
            is Int -> println("$x is Int")
        }
    }

    fun func_when3(x: Int) {
        when {
            when3(x) -> println("x is between 4 and 10")
            else -> println("x is outside 4 and 10")
        }
    }

    fun when3(x: Int): Boolean {
        return x in 4..10
    }

    fun func_for() {
        val collection = arrayOf(1, 2, 3, "4", "5", "6")
        //对迭代器对象集合进行遍历
        for (item in collection) println(item)
        //通过索引对数组进行遍历
        for (i in collection.indices) println(collection[i])
        //使用库函数withIndex进行遍历
        for ((index, value) in collection.withIndex()) println("the element at $index is $value")
    }

    fun func_while() {
        var x: Int = 5
        while (x > 0) {
            println("while --- x = " + x)
            x--
        }

        do {
            println("do...while --- x = " + x)
            x++
        } while (x < 5)
    }
}