import java.lang.Math.sqrt

/*
Сделать класс Figure, из предыдущего урока абстрактным, перенести объявление функции area и length в него,
оставив реализацию полиморфной для классов Rectangle и Round
Для этого предварительно скопируйте сюда код классов, который вы написали в предыдущей задаче

Для этой задачи есть видео с разбором.
*/

fun main() {
    val rectangle = Rectangle(30.5, 30.5, "RED")
    rectangle.moveDown(3)
    rectangle.moveLeft(5)
    rectangle.area()
}

abstract class Figure(val color: String) {
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

    abstract fun area(): Double

    abstract fun length(): Double
}

class Rectangle(private val width: Double, private val height: Double, color: String) : Figure(color) {

    override fun area(): Double {
        return width * height
    }

    override fun length(): Double {
        return 2 * (width + height)
    }

    fun rectangleSquare(number: Int) {
        if (width == height)
            println("Прямоугольник $number является квадратом")
        else
            println("Пямоугольник $number не является квадратом")
    }
}

class Round(private val radius: Double, color: String) : Figure(color) {

    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun length(): Double {
        return 2 * Math.PI * radius
    }
}