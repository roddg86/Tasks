/*
Напишите класс круга (Round) с полем radius (радиус), инициализирующимся через конструктор.
Добавьте в него функции, которые будут считать площадь (Math.PI* radius * radius) и длину окружности (2*Math.PI*radius)
Создайте объект класса Round и проверьте работоспособность написанных функций
*/

fun main() {

    val round = Round()
    round.square(1)
    round.circumference(1)

    val round2 = Round(40)
    round2.square(2)
    round2.circumference(2)

}

class Round(private val radius: Int = 20) {
    fun square(number: Int) {
        val result = Math.PI * radius * radius
        println("Площадь круга $number равна $result")
    }

    fun circumference(number: Int) {
        val result = 2 * Math.PI * radius
        println("Длинна окружности $number ранва $result")
    }
}