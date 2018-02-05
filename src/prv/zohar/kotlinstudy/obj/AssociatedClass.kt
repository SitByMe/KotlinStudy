package prv.zohar.kotlinstudy.obj

class AssociatedClass {
    companion object Factory {
        fun create(): AssociatedClass = AssociatedClass()
    }
}