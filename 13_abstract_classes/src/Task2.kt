/*
Добавить еще один класс Triangle – тоже наследник Figure (который вы сделали в предыдущем задании)
и прописать работу функций area() и length() для него

Для этой задачи есть видео с разбором.
*/

fun main() {
    val rectangle = Rectangle2(30.5, 30.5, "RED")
    rectangle.moveDown(3)
    rectangle.moveLeft(5)
    rectangle.area()
}

abstract class Figure2(val color: String) {
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

class Rectangle2(private val width: Double, private val height: Double, color: String) : Figure(color) {

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

class Round2(private val radius: Double, color: String) : Figure(color) {

    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun length(): Double {
        return 2 * Math.PI * radius
    }

}

class Triangle(color: String, val a: Double, val b: Double, val c: Double) : Figure(color) {
    override fun area(): Double {
        val p = (a + b + c) / 2
        return kotlin.math.sqrt(p * (p - a) * (p - b) * (p - c))
    }

    override fun length(): Double {
        return a + b + c
    }


}