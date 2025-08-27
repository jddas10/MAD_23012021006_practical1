import java.util.Arrays


data class Matrix(val data: Array<IntArray>, val noOfRow: Int, val noOfCol: Int) {

    operator fun plus(other: Matrix): Matrix {
        if (this.noOfRow != other.noOfRow || this.noOfCol != other.noOfCol) {
            throw IllegalArgumentException("Matrix dimensions for addition must be the same.")
        }
        val result = Array(noOfRow) { IntArray(noOfCol) }
        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                result[i][j] = this.data[i][j] + other.data[i][j]
            }
        }
        return Matrix(result, noOfRow, noOfCol)
    }

    operator fun minus(other: Matrix): Matrix {
        if (this.noOfRow != other.noOfRow || this.noOfCol != other.noOfCol) {
            throw IllegalArgumentException("Matrix dimensions for subtraction must be the same.")
        }
        val result = Array(noOfRow) { IntArray(noOfCol) }
        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                result[i][j] = this.data[i][j] - other.data[i][j]
            }
        }
        return Matrix(result, noOfRow, noOfCol)
    }

    operator fun times(other: Matrix): Matrix {
        if (this.noOfCol != other.noOfRow) {
            throw IllegalArgumentException("Columns of first matrix must equal rows of second matrix for multiplication.")
        }
        val result = Array(this.noOfRow) { IntArray(other.noOfCol) }
        for (i in 0 until this.noOfRow) {
            for (j in 0 until other.noOfCol) {
                for (k in 0 until this.noOfCol) {
                    result[i][j] += this.data[i][k] * other.data[k][j]
                }
            }
        }
        return Matrix(result, this.noOfRow, other.noOfCol)
    }

    override fun toString(): String {
        val builder = StringBuilder("\n")
        for (row in data) {
            builder.append(row.joinToString(separator = "\t", prefix = "[", postfix = "]")).append("\n")
        }
        return builder.toString()
    }
}


fun main() {
    val firstMatrix = Matrix(arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4)), noOfRow = 2, noOfCol = 3)
    val secondMatrix = Matrix(arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4)), noOfRow = 3, noOfCol = 2)
    val secondMatrix1 = Matrix(arrayOf(intArrayOf(6, 3), intArrayOf(9, 0), intArrayOf(5, 4)), noOfRow = 3, noOfCol = 2)

    println("**********Addition************")
    print("Matrix:1 $secondMatrix1")
    print("Matrix:2 $secondMatrix")
    val thirdMatrix = secondMatrix1 + secondMatrix
    println("Addition: $thirdMatrix")

    println("**********Subtraction************")
    print("Matrix:1 $secondMatrix1")
    print("Matrix:2 $secondMatrix")
    val subtractMatrix = secondMatrix1 - secondMatrix
    println("Subtraction: $subtractMatrix")

    println("**********Multiplication************")
    print("Matrix:1 $firstMatrix")
    print("Matrix:2 $secondMatrix")
    val multiplication = firstMatrix * secondMatrix
    println("Multiplication: $multiplication")
}