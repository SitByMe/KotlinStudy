package prv.zohar.kotlinstudy.obj

class B11 {
    private fun foo() = object {
        val x = "x"
    }

    public fun publicFoo() = object {
        val x = "px"
    }

    fun bar(){
        val x = foo().x
        //val px = publicFoo().x
    }
}