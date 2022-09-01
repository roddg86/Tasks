/*
Напишите класс прямоугольника (Rectangle) с полями width и height (ширина и высота), инициализирующимися через конструктор.
Добавьте в него функции, которые будут считать площадь (width*height) и периметр прямоугольника (2*(width+height))
Добавьте функцию, которая будет отвечать на вопрос является ли этот прямоугольник квадратом (равны ли его стороны)
Создайте объект класса Rectangle и проверьте работоспособность написанных функций

Для этой задачи есть видео с разбором.
*/

fun main() {

    val rectangle = Rectangle()
    rectangle.square(1)
    rectangle.perimeter(1)
    rectangle.rectangleSquare(1)

    val rectangle2 = Rectangle(4, 5)
    rectangle2.square(2)
    rectangle2.perimeter(2)
    rectangle2.rectangleSquare(2)

    val rectangle3 = Rectangle(10, 10)
    rectangle3.rectangleSquare(3)

}

class Rectangle(val width: Int = 30, val height: Int = 60) {
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