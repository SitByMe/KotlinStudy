package prv.zohar.kotlinstudy.nestedClass

class OutClass {
    private var bar: Int = 1

    inner class NestedClass {
        fun foo() = bar
    }
}