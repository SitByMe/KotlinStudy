package prv.zohar.kotlinstudy.classesandobjects

class Student : Person, Play {
    override val num: Int
        get() = 1

    override fun look() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override var x: Int = 456
        get() = field
        private set

    private var y: Int = 123

    constructor(name: String) : super(name)
    constructor(name: String, age: Int) : super(name, age)
    constructor(name: String, age: Int, sex: String) : super(name, age, sex)

    override fun sleep() {
        super.sleep()
    }

    final override fun say() {
        super<Play>.say()
        super<Person>.say()
    }

    companion object {
        lateinit var a: String
    }
}