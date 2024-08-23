package games.luck

import java.awt.event.KeyEvent
import java.time.DayOfWeek
import java.time.LocalDate
import kotlin.random.Random

class MyDate {
    private val date = LocalDate.now()

    private fun dayOfWeekString(month: DayOfWeek): String {
        return when (month) {
            DayOfWeek.MONDAY -> "월"
            DayOfWeek.TUESDAY -> "화"
            DayOfWeek.WEDNESDAY -> "수"
            DayOfWeek.THURSDAY -> "목"
            DayOfWeek.FRIDAY -> "금"
            DayOfWeek.SATURDAY -> "토"
            DayOfWeek.SUNDAY -> "일"
        }
    }

    fun getToday(): String {
        return "${date.year}년 ${date.monthValue}월 ${date.dayOfMonth}일 ${dayOfWeekString(date.dayOfWeek)}요일"
    }
}


fun main() {
    val date = MyDate()

    while (true) {
        val random = Random.nextInt(0, 100)
        println("${date.getToday()}의 금전운<100>: ${random}%")

        while (true) {
            println("다시 하시겠습니까?(y/n)")
            val value = readln()
            if (value == "y" || value.isEmpty()) break
            else if (value == "n") return
            else println("y/n 으로 입력해주세요.")
        }
    }
}