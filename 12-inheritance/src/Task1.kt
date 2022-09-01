/*
Для созданных в предыдущих задачах классов Rectangle и Round (нужно сюда скопировать ваш код этих классов)
пропишите суперкласс Figure, в котором будет поле цвет типа String, которое должно инициализироваться через конструктор
и два поля x и y типа Int, которые будут задавать положение фигуры в пространстве относитльено начала координат
и инициализироваться в теле класса начальными значениями ноль.

Пропишите в этом классе функции moveLeft(step: Int), moveRight(step: Int), moveDown(step: Int), moveUp(step: Int),
которые будут сдвигать фигуру, то есть менять ее координаты x и y

Сделайте Rectangle и Round наследниками класса Figure

Для этой задачи есть видео с разбором.
*/

fun main(){
    val rectangle = Rectangle(30,30,"RED")
    rectangle.moveDown(3)
    rectangle.moveLeft(5)
}

open class Figure(val color: String) {
    var x: Int = 0
    var y: Int = 0

    fun moveLeft(step: Int) {
        x += step
    }

    fun moveRight(step: Int) {
        x -= step
    }

    fun moveDown(step: Int) {
        y -= step
    }

    fun moveUp(step: Int) {
        y += step
    }
}

class Rectangle(val width: Int = 30, val height: Int = 60, color: String) : Figure(color) {
    fun square(number: Int) {
        println("Площадь прямоугольника $number равна ${width * height}")
    }

    fun perimeter(number: Int) {
        println("Периметр прямоугольника $number равен ${2 * (width + height)}")
    }

    fun rectangleSquare(number: Int) {
        if (width == height)
            println("Прямоугольник $number является квадратом")
        else
            println("Пямоугольник $number не является квадратом")
    }
}

class Round(private val radius: Int = 20, color: String) : Figure(color) {
    fun square(number: Int) {
        val result = Math.PI * radius * radius
        println("Площадь круга $number равна $result")
    }

    fun circumference(number: Int) {
        val result = 2 * Math.PI * radius
        println("Длинна окружности $number ранва $result")
    }
}