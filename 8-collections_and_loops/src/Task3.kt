/*
Для классов User и Car из задач по дата-классам написать функцию, которая принимает на вход список автомобилей
и пользователя и выдает список только тех автомобилей из исходного списка, которые доступны данному пользователю.

Дата-классы User и Car уже описаны в этом разделе и достуны здесь.

Проверьте работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {

    val user = User("Oleg", 25, 100)
    val car1 = Car("Audi", "TT", 12.5)
    val car2 = Car("BMW", "x5", 14.5)
    val car3 = Car("Lada", "Kalina", 10.5)
    var listCars = mutableListOf(car1, car2, car3)

    var result = CarUser(listCars, user)
    println(result)

}

fun CarUser(cars: List<Car>, users: User): List<Car> {

    var listOfCars = mutableListOf<Car>()
    for (list in cars) {
        val true1 = users.age >= 26 && users.experience >= 6
        val true2 = users.age >= 21 && users.experience >= 2 && list.brand != "Audi" && list.brand != "BMW"
        if (true1 || true2)
            listOfCars.add(list)
    }

    return listOfCars
}