/*
Создайте коллекцию перемещаемых объектов (которые реализуют интерфейс Movable из предыдущей задачи),
среди которых будут разные геометрические фигуры и животные.
Переместить все элементы коллекции вправо на 10 шагов

Для этой задачи есть видео с разбором.
*/


fun main() {

    val animal = Animal2("Cow")
    animal.moveDown(4)

    val animal2 = Animal2("Tiger")
    val triangle2 = Triangle2("Ferst", 2.5, 3.5, 4.5)

    val movCols = mutableListOf(animal, animal2, triangle2)

    for (movecol in movCols) {
        movecol.moveDown(7)
        movecol.moveLeft(6)
    }
}

interface Movable3 {
    fun moveLeft(step: Int)
    fun moveRight(step: Int)
    fun moveDown(step: Int)
    fun moveUp(step: Int)
}

class Animal2(name: String) : Movable2 {
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

class Triangle2(color: String, val a: Double, val b: Double, val c: Double) : Movable2 {
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