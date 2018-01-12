package prv.zohar.kotlinstudy.modifier

open class Modifier private constructor(pri: String) {
    private var pri: String = "pri"
    protected var pro: Int = 123
    internal var i: Double = 1.0
    public var pub: Long = 2L

    protected constructor(pri: String, pro: Int) : this(pri)
    internal constructor(pri: String, pro: Int, i: Double) : this(pri, pro)
    public constructor(pri: String, pro: Int, i: Double, pub: Long) : this(pri, pro, i)
}