fun fact(num : Int ): Long{
    return if (num==1)
    {
        1
    }
    else{
        num*fact(num-1)
    }

}






fun main(){
    println("Enter a number : ")
    val num = readln().toInt()

    val result = 0
    println("Factorial of $num is : " +fact(num))


}