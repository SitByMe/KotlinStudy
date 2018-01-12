package prv.zohar.kotlinstudy.classesandobjects

object Test2 {
    lateinit var lvar: Person

    @JvmStatic
    fun main(args: Array<String>) {
        val person1 = Person("Smith")
        var person2 = Person("Jim", 18)
        val person3 = Person("Lily", 17, "girl")
        person1.eat()
        println("person3.name = " + person3.name + ", person3.age = " + person3.age + ", person3.sex = " + person3.sex)

        val student1 = Student("Jack")
        val student2 = Student("Jim", 19)
        val student3 = Student("LiLei", 18, "boy")
        student1.say()
        println("student3.name = " + student3.name + ", student3.age = " + student3.age + ", student3.sex = " + student3.sex)

        /*lvar = Person("Tom", 19, "boy")
        lvar.s = Student("a", 19, "")
        if (lvar::s.isInitialized) {
            println(lvar.name + " is " + lvar.age + " years old")
        }*/

        println("student1.numStr = " + student1.numStr)
    }
}