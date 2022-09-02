/*
1.	Есть класс:
    class SomeEmployee(
            val name: String,
            val salary: Int
    ) {

        fun callToClient(clientName: String) {
            println("Сотрудник ${name}: звоню клиенту $clientName")
        }
    }

Написать функцию
fun findEmployeeBySalary(employees: List<SomeEmployee>, age: Int): SomeEmployee?
которая ищет в списке сотрудников сотрудника с заданной зарплатой.
Сделайте так, чтобы функция возвращала null в случае если такого сотрудника в списке нет
Создать произвольный список сотрудников. Используя эту функцию найти в списке сотрудника с определенной зарплатой.
Вызвать у него функцию callToClient, используя безопасный вызов (?)
*/

fun main() {

    val employees = SomeEmployee("Oleg", 10000)
    val employees2 = SomeEmployee("Oleg2", 15000)
    val employees3 = SomeEmployee("Oleg3", 20000)

    val listEmployees = mutableListOf(employees,employees2,employees3)

    val employeeSalary = findEmployeeBySalary(listEmployees,10000)
    employeeSalary?.callToClient("Timur")
}

class SomeEmployee(
    private val name: String,
    val salary: Int
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee?{
    for (employee in employees)
        if (employee.salary == salary)
            return employee

    return null
}