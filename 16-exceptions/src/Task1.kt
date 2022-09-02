/*
Переделайте функцию findEmployeeBySalary  из задачи по null safety таким образом, чтобы ее возвращаемый тип
был SomeEmployee,а не SomeEmployee?.
А в случае если подходящий сотрудник не найден, выбрасывайте исключительную ситуацию.
Вызовите эту функцию из main, обернув ее в try catch, обработав эту исключительную ситуацию в функции main.

p.s. здесь речь не идет о том, что такой вариант в данном случае предпочтительнее, чем использование null.
Рассматривайте это просто как практику работы с Exceptions

Для этой задачи есть видео с разбором.
*/

fun main() {

    val employees = SomeEmployee("Oleg", 10000)
    val employees2 = SomeEmployee("Oleg2", 15000)
    val employees3 = SomeEmployee("Oleg3", 20000)

    val listEmployees = mutableListOf(employees, employees2, employees3)

    try {
        val result = findEmployeeBySalary(listEmployees, 17000)
        println(result)
    }catch (e: Exception){
        println(e.message)
    }

}

class SomeEmployee(
    val name: String,
    val salary: Int
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee {
    for (employee in employees)
        if (employee.salary == salary)
            return employee

    throw Exception("Сотрудник с зарплатой $salary не найден")
}