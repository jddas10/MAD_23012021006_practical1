fun Addition(num1 : Int , num2 : Int ): Int {
    val result  = num1 + num2
    return result
}

fun Substraction(num1 : Int , num2 : Int ): Int {
    val result  = num1 - num2
    return result
}

fun Multiplaction (num1 : Int , num2 : Int ): Int {
    val result  = num1 * num2
    return result
}

fun Division(num1 : Int , num2 : Int ): Int {
    val result  = num1 / num2
    return result
}





fun main (  )
{
    println("Enter two numbers : ")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    println( "Addition of : $num1 , $num2 = ${Addition(num1 , num2)} ")
    println( "Substraction of : $num1 , $num2 = ${Substraction(num1 , num2)} ")
    println( "Multiplaction of : $num1 , $num2 = ${Multiplaction(num1 , num2)} ")
    println( "Division of : $num1 , $num2 = ${Division(num1 , num2)} ")


}