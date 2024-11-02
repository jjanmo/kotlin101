package games.rps

import kotlin.random.Random


fun getComputer(): String {
    val computer = Random.nextInt(3) // 0,1,2
    return when (computer) {
        0 -> "가위"
        1 -> "바위"
        else -> "보"
    }
}

fun checkInput(human: String, computer: String): String = when {
    human == "가위" && computer == "바위" -> "computer"
    human == "가위" && computer == "보" -> "human"
    human == "바위" && computer == "가위" -> "human"
    human == "바위" && computer == "보" -> "computer"
    human == "보" && computer == "가위" -> "computer"
    human == "보" && computer == "바위" -> "human"
    else -> "draw"
}

fun main() {
    while (true) {
        val allowableInput = listOf("가위", "바위", "보")
        var human: String

        while (true) {
            println("가위 바위 보 중 하나를 입력하세요.")
            human = readln()
            if (allowableInput.contains(human)) break
            println("가위 바위 보 중에서 선택해서 입력하세요.")
        }

        val computer = getComputer()
        val result = checkInput(human, computer)

        when (result) {
            "computer" -> println("컴퓨터가 이겼습니다. : 인간($human) : 컴퓨터($computer)")
            "human" -> println("인간이 이겼습니다. : 인간($human) : 컴퓨터($computer)")
            else -> println("비겼습니다.")
        }

        println("q를 누르면 게임을 종료합니다. 계속하려면 엔터를 입력하세요.")
        val isEnd = readln()
        if (isEnd == "q") return
    }
}