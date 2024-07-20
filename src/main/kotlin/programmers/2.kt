package programmers

class Problem2 {
    /** 잘못된 풀이 */
    fun sol1(myString: String, overwriteString: String, s: Int): String {
        val sub = myString.substring(s until s + overwriteString.length)
        val newString = myString.replace(sub, overwriteString)
        return newString
    }

    fun sol2(myString: String, overwriteString: String, s: Int): String {
        val pre = myString.substring(0, s)
        val post = myString.substring(s + overwriteString.length)
        return "$pre$overwriteString$post"
    }
}

data class Quadruple<A, B, C, D>(
    val arg1: A,
    val arg2: B,
    val arg3: C,
    val output: D
)

fun main() {
    val cases = mapOf(
        "example" to Quadruple("He11oWor1d", "lloWorl", 2, "HelloWorld"),
        "counterexample" to Quadruple("hahahahahahahahha", "youretoslow", 4, "hahayouretoslowha")
    )

    val problem = Problem2()

    val (arg1, arg2, arg3, output) = cases["example"]!!
    val result1 = problem.sol1(arg1, arg2, arg3)
    println("$result1 $output ${result1 == output}")
    val (cArg1, cArg2, cArg3, cOutput) = cases["counterexample"]!!
    val result2 = problem.sol1(cArg1, cArg2, cArg3)
    println("$result2 $cOutput ${result2 == cOutput}")

//    val (arg1, arg2, arg3, output) = cases["example"]!!
//    val result1 = problem.sol2(arg1, arg2, arg3)
//    println("$result1 $output ${result1 == output}")
//    val (cArg1, cArg2, cArg3, cOutput) = cases["counterexample"]!!
//    val result2 = problem.sol2(cArg1, cArg2, cArg3)
//    println("$result2 $cOutput ${result2 == cOutput}")


}

