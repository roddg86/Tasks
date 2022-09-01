/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает средний возраст всех пользователей.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {

    val user1 = User("Oleg", 25, 10)
    val user2 = User("Oleg2", 26, 11)
    val user3 = User("Oleg3", 27, 12)
    val user4 = User("Oleg4", 28, 13)

    var users = mutableListOf<User>(user1, user2, user3, user4)
    val sumAge = middleAge(users)
    println(sumAge)

}

fun middleAge(users: List<User>): Double {
    var sum: Double = 0.0
    for (user in users)
        sum = users.sumOf { it.age.toDouble() }
    sum /= users.size
    return sum
}