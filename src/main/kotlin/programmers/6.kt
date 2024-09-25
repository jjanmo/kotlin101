package programmers

class Problem6 {
    fun sol1(num1: Int, num2: Int): Int {
        val sum1 = "$num1$num2"
        val sum2 = "$num2$num1"

        val result = if (sum1.toInt() > sum2.toInt()) sum1
        else sum2

        return result.toInt()
    }

    fun sol2(num1: Int, num2: Int): Int {
        val sum1 = num1.toString() + num2.toString()
        val sum2 = num2.toString() + num1.toString()
        val result = sum1.toInt().coerceAtLeast(sum2.toInt())
        sum1.compareTo(sum2)

        return result
    }

}


fun main() {
    val (string1, string2) = readln().split(' ')
    val num1 = string1.toInt()
    val num2 = string2.toInt()

    val problem = Problem6()
//    val result = problem.sol1(num1, num2)
    val result = problem.sol2(num1, num2)
    println(result)
}