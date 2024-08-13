package games.gugudan


fun main() {
    val range = 1..9

    while (true) {
        val preNumber = range.random()
        val postNumber = range.random()
        println("구구단 ${preNumber}단에 대한 문제입니다.")
        println("$preNumber * $postNumber = ?")
        val result = preNumber * postNumber

        val input = readlnOrNull()
        if (input.isNullOrBlank() || input.toIntOrNull() == null) {
            println("입력 오류로 프로그램을 종료합니다.")
            return
        }

        if (input.toInt() == result) {
            println("맞았습니다.")
            return
        } else {
            println("틀렸습니다.")
            println("정답은 ${result}입니다.")
        }
    }
}