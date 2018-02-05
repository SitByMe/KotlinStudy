package prv.zohar.kotlinstudy.dataClass

object Test6 {
    @JvmStatic
    fun main(args: Array<String>) {
        val user1 = User("Jim", 16)
        val user2 = User("Tom", 18)
        val name1 = user1.component1()
        val age1 = user1.component2()
        println("$name1,$age1 years old")
        println("user1.toString():" + user1.toString() + "   user1.hashCode():" + user1.hashCode())
        println("user2.toString():" + user2.toString() + "   user2.hashCode():" + user2.hashCode())
        println("user1.equals(user2):" + user1.equals(user2))

        println("-------------------")
        //copy
        val user3 = user1.copy(age = 13)
        println("user3.toString():" + user3.toString())

        println("-------------------")
        //解构声明
        val user4 = User("Kitty", 12)
        val (name, age) = user4
        println("$name,$age years old")

        println("-------------------")
        //标准数据类
        val p = Pair("A11", 2)
        val t = Triple("A11", "B", 3)
        println(p.toString())
        println(t.toString())
        val (ap, bp) = Pair("AP", 2)
        val (at, bt, ct) = Triple("AT", "BT", 3)
        println("(ap = $ap,bp = $bp)")
        println("(at = $at,bt = $bt,ct = $ct)")
    }
}