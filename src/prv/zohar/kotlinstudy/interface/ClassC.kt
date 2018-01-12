package prv.zohar.kotlinstudy.`interface`

class ClassC : MyInterfaceA, MyInterFaceB {

    override fun funcA() {
        super<MyInterfaceA>.funcA()
    }

    override fun funcB() {
        super.funcB()
    }

    override fun funcC() {
        super<MyInterfaceA>.funcC()
        super<MyInterFaceB>.funcC()
    }
}