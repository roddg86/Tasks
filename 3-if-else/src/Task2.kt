/* Для двух целых чисел вывести на экран «первое число больше» если первое больше, «второе число больше»
 если второе больше и вывести «числа равны», если они равны */

fun main() {
    val number1: Int = 10
    val number2: Int = 20

    when {
        number1 > number2 -> println("первое число больше")
        number2 > number1 -> println("второе число больше")
        number1 == number2 -> println("числа равны")
    }
}