/*
Написать функцию, которая возвращает большее из двух целых чисел.

Проверить работу написанной функции на примере каких-нибудь входных данных.
 */

fun main() {
    val number1 = 10
    val number2 = 20

    val max = maxNumber(number1,number2)
    println(max)
}

fun maxNumber(one: Int, two: Int): Int {
    val max = if (one > two) {
        one
    }else{
        two
    }
    return max
}