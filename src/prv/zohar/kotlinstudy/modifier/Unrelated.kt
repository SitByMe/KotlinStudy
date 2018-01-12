package prv.zohar.kotlinstudy.modifier

class Unrelated(modifier: Modifier) {
    init {
        //private、protected 不可访问
        //internal、public 可访问
        modifier.i = 1.9
        modifier.pub = 2L
    }
}