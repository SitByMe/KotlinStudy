package prv.zohar.kotlinstudy.modifier

class SubModifier : Modifier() {
    fun funcA() {
        //private 不可访问
        //protected、internal、public 可访问
        pro = 1
        i = 2.0
        pub = 3
    }
}