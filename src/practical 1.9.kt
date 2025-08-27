fun main ()
{
    println("Enter array size : ")
    val size = readln().toInt()

    val JDDAS = IntArray(size)

    println("Enter $size number : ")
    for(i in 0 until size)
    {
        JDDAS[i] = readln().toInt()
    }

    println("your array : ${JDDAS.contentToString()}")

    val maxnum = JDDAS.maxOrNull()

    println("max number is : $maxnum")

}