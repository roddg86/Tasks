/*
Написать функцию, которая возвращает количество элементов, удовлетворяющих условию:
fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int

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

    val result = elementsCount(users){it.name.length > 4}
    println(result)

}

/* функция подсчета количества элементов */
fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int{
    var counter = 0
    for (user in users)
        if(condition(user))
            counter++
    return counter
}