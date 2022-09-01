/*
Написать функцию преобразования каждого элемента коллекции пользователей в String в соответствии с заданным лямбда-выражением
fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>

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
    val result = convertToStrings(users) { "Name: ${it.name}. Age: ${it.age}" }
    println(result)

}

fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String> {
    var listString = mutableListOf<String>()
    for (user in users)
        listString.add(conversion(user))
    return listString
}