package programmers

class Problem1 {
    fun sol1(list: List<String>) {
        val string = list[0]
        val number = list[1].toInt()

        var result = ""
        var count = 0
        while (count < number) {
            result += string
            count++
        }
        println(result)
    }

    fun sol2(list: List<String>) {
        val string = list[0]
        val number = list[1].toInt()

        val result = string.repeat(number)
        println(result)
    }
}


fun main() {
    print("[문자열 숫자] 입력 : ")
    val input = readln().split(' ')

    val problem = Problem1()
    problem.sol1(input)
    problem.sol2(input)
}