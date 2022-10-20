fun main() {

    val object1 = Cylinder(3,5)
    object1.TestFun()

    val object2 = Cube (3)
     object2.Testfun2()

    val object3 = Cone (2,5)
    object3.Testfun3()


}

const val pi = 3.14

class Cylinder (var height: Int,var radius: Int){

    fun TestFun(){
        print("Volume of a Cylinder is: " )
        println(pi * radius * radius * height)

    }

}

class Cube (var length: Int) {
    fun Testfun2() {
        print("Volume of a cube is: ")
        println(length * length * length)
    }
}

class Cone (var height: Int, var radius: Int) {
    fun Testfun3() {
        print("Volume of a cone is: ")
        println( pi * radius * radius * height /3)
    }
}

