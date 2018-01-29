package prv.zohar.kotlinstudy.extended

open class C constructor() {
    var str = "str"
    var int = 1

    constructor(string: String, int: Int) : this() {
        this.str = string
        this.int = int
    }

    open fun f() = "member f"

    fun foo() {
        println("C.foo")
    }

    override fun toString(): String {
        return "C(str='$str', int=$int)"
    }
}