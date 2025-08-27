fun main()
{
    println("Enter a number which you want to cheak : ")
    val num = readln().toInt()

    println(if (num % 2 == 0) "$num is even"  else "$num is odd ")



}