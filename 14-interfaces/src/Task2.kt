/*
Создайте класс Animal с полями name: String, x: Int, y: Int, который будет реализовывать интерфейс Movable
из предыдущей задачи (любой вариант реализации на ваш выбор)

Для этой задачи есть видео с разбором.
*/

fun main() {

    val animal = Animal("Cow")
    animal.moveDown(4)

}

interface Movable2 {
    fun moveLeft(step: Int)
    fun moveRight(step: Int)
    fun moveDown(step: Int)
    fun moveUp(step: Int)
}

class Animal(name: String) : Movable2 {
    private var x: Int = 0
    private var y: Int = 0

    override fun moveLeft(step: Int) {
        x = +step
    }

    override fun moveRight(step: Int) {
        x = -step
    }

    override fun moveDown(step: Int) {
        y = +step
    }

    override fun moveUp(step: Int) {
        y = +step
    }

}