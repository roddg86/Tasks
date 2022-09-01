/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает самого младшего из них

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {

    val user1 = Employee("Oleg", 27)
    val user2 = Employee("Oleg2", 32)
    val user3 = Employee("Oleg3", 34)
    val user4 = Employee("Oleg4", 36)
    val user5 = Employee("Oleg5", 38)

    var users = mutableListOf<Employee>(user1, user2, user3, user4, user5)
    val minAge = theYoungest(users)
    println(minAge)

}

fun theYoungest(employees: List<Employee>): Int {
    var min = 0
    for (employee in employees)
        min = employees.minOf { it.age }
    return min
}