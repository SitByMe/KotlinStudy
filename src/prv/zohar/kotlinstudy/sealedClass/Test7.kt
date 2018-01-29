package prv.zohar.kotlinstudy.sealedClass

object Test7 {
    @JvmStatic
    fun main(args: Array<String>) {
        println(eval(Const(3.0)))
    }

    fun eval(expr: Expr): Double = when (expr) {
        is Const -> expr.number
        is Sum -> eval(expr.e1) + eval(expr.e2)
        NotANumber -> Double.NaN
        //不再需要 else 子句了，因为我们已经覆盖了所有的情况
    }
}