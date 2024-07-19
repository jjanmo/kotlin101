package programmers


class Solution {
    fun sol1(list: List<String>) {
        val s1 = list[0]
        val a = list[1].toInt()

        var result = ""
        var count = 0
        while (count < a) {
            result += s1
            count++
        }
        println(result)
    }

}


fun main(args: Array<String>) {
    print("[문자열 숫자] 입력 : ")
    val input = readln().split(' ')

    val solution = Solution()
    solution.sol1(input)
}