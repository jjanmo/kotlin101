package programmers

class Problem3 {
    fun sol1(str1: String, str2: String): String {
        val length = str1.length
        val sb = StringBuilder()
        for (i in 0 until length) {
            sb.append(str1[i]).append(str2[i])
        }
        return sb.toString()
    }
}


fun main() {
    print("[같은 길이 문자열1 문자열2] 입력 : ")
    val (string1, string2) = readln().split(' ')

    val problem = Problem3()
    val result = problem.sol1(string1, string2)
    println(result)
}