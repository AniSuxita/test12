fun main() {
    val methodInKotlin = MethodInKotlin()
    methodInKotlin.methodWithoutReturnTypeWithParameter("Erselan Khan")
}

class MethodInKotlin {
    // Passing name as String and no return type
    fun methodWithoutReturnTypeWithParameter(name: String): Unit {
        println("called method methodWithoutReturnTypeWithParameter, Print my name: $name")
    }
