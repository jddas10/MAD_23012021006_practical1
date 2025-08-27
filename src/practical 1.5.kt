fun main ()
{
    println("Enter Month Number : ")
    val num = readln().toString()



    when(num)
    {

        "1" -> println("January")
        "2" -> println("February")
        "3" -> println("March")
        "4" -> println("April")
        "5" -> println("May")
        "6" -> println("June ")
        "7" -> println("July")
        "8" -> println("August")
        "9" -> println("september")
        "10" -> println("october")
        "11" -> println("november")
        "12" -> println("December")
        else -> println("Please enter proper number ")

    }

}