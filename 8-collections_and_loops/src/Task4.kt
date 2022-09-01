/*
Даны классы
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функцию, которая на вход принимает объект класса Department и возвращает средний возраст сотрудников этого отдела
Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {

    val user1 = Employee("Oleg1", 25)
    val user2 = Employee("Oleg2", 27)
    val user3 = Employee("Oleg3", 29)
    val user4 = Employee("Oleg4", 31)

    var userList = mutableListOf(user1,user2,user3,user4)

    val department = Department("Accounting", userList)
    val result = midlAge(department)
    println(result)

}

fun midlAge(department: Department): Int{
    var sum = 0
    for (age in department.employees){
        sum += age.age
    }
    sum /= department.employees.size
    return sum
}