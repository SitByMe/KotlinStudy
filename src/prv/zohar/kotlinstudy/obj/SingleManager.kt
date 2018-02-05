package prv.zohar.kotlinstudy.obj

object SingleManager {
    private lateinit var singleClass: SingleClass

    fun registerSingleClass(singleClass: SingleClass) {
        this.singleClass = singleClass
    }

    fun printSingle() {
        if (SingleManager::singleClass.isInitialized)
            println(singleClass.x)
    }
}