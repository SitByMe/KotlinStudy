package prv.zohar.kotlinstudy.extended

object Test5_2 {
    @JvmStatic
    fun main(args: Array<String>) {
//        printFoo(D())
//        printFoo(C5())

        C5().foo()
        C5().foo(1)
    }

    fun printFoo(c: C5) {
        println(c.f())
    }

    open fun C5.foo() {
        println("extension foo")
    }

    open fun C5.foo(i: Int) {
        println("extension foo " + i)
    }
}