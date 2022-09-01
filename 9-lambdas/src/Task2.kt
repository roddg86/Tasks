/*
Написать функцию, которая отвечает на вопрос присутствует ли в коллекции элемент, который удовлетворяет условиям
fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean


Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun main() {

    val user1 = User("Oleg", 25)
    val user2 = User("Oleg2", 26)
    val user3 = User("Oleg3", 27)
    val user4 = User("Oleg4", 28)

    var users = mutableListOf<User>(user1, user2, user3, user4)

    val result = containsElement(users) { it.name.length > 4 }

    println(result)

}

fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean {
    var bool = false
    for (user in users)
        if (condition(user))
            bool = true
    return bool

}