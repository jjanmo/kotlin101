package games.gugudan


fun main() {
    val range = 1..9
    val preNumber = range.random()
    val postNumber = range.random()
    println("구구단 ${preNumber}단에 대한 문제입니다.")
    println("$preNumber * $postNumber = ?")

    val result = preNumber * postNumber
    val input = readlnOrNull()
    if (input?.toInt() == result) println("맞았습니다.")
    else println("틀렸습니다.")
}