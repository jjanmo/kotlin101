package games.luck

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
    val random = Random.nextInt(0, 100)
    println("${date.getToday()}의 금전운<100>: ${random}%")
}