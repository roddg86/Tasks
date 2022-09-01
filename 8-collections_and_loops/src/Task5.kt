/*
Дана следующая структура классов.
Компания: data class Company(val name: String, val departments: List<Department>)
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функции для подсчета общего количества человек, работающих в заданной компании и их среднего возраста:
fun totalNumberOfEmployees(company: Company): Int
fun averageAgeOfEmployees(company: Company): Int

Для этой задачи есть видео с разбором.
*/

fun main() {

    val user1 = Employee("Oleg1", 25)
    val user2 = Employee("Oleg2", 26)
    val user3 = Employee("Oleg3", 27)
    val user4 = Employee("Oleg4", 28)
    val user5 = Employee("Oleg5", 70)
    val user6 = Employee("Oleg6", 60)
    val user7 = Employee("Oleg7", 65)

    val userList1 = mutableListOf(user1, user2, user3, user4)
    val userList2 = mutableListOf(user5, user6, user7)

    val department1 = Department("Accounting", userList1)
    val department2 = Department("It", userList2)

    val departmentList = mutableListOf(department1, department2)
    val company = Company("Luxsoft", departmentList)

    val resultSum = totalNumberOfEmployees(company)
    val resulMidlAge = averageAgeOfEmployees(company)

    println(resultSum)
    println(resulMidlAge)

}

fun totalNumberOfEmployees(company: Company): Int {
    var sum = 0
    for (empl in company.departments)
        sum += empl.employees.size
    return sum
}

fun averageAgeOfEmployees(company: Company): Int {
    var sum = 0
    for (empl in company.departments) {
        for (age in empl.employees) {
            sum += age.age
        }
    }
    sum /= totalNumberOfEmployees(company)
    return sum
}
