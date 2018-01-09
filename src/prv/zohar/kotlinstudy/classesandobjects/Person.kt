package prv.zohar.kotlinstudy.classesandobjects


open class Person {
    open val x: Int = 123

    fun get() {

    }

    lateinit var s: Student
    var name: String = ""
    var age: Int = -1
    var sex: String = ""

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    constructor(name: String, age: Int, sex: String) : this(name, age) {
        this.sex = sex
    }

    fun eat() {}
    open fun sleep() {}
    open fun say() {
        println("Person.say()")
    }
}
