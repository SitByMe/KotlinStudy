package prv.zohar.kotlinstudy.extended

object Test5_2 {
    @JvmStatic
    fun main(args: Array<String>) {
//        printFoo(D())
//        printFoo(C())

        C().foo()
        C().foo(1)
    }

    fun printFoo(c: C) {
        println(c.f())
    }

    open fun C.foo() {
        println("extension foo")
    }

    open fun C.foo(i: Int) {
        println("extension foo " + i)
    }
}