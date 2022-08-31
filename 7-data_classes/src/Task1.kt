/*
Опишите дата классы для хранения информации из задания 5 по функциям.
Для пользователя (User) должно храниться имя, возраст, стаж. Для автомобиля (Car): бренд, цена аренды

Переделайте задачи 5 и 6 из раздела функции на работу с этими дата-классами.
Т.е. функции должны принимать не возраст, стаж и бренд авто, а объекты классов User и Car
(функции пишите в этом файле заново)

Поля «имя» в классе User и «цена аренды» в классе Car никак не будут использоваться в тех функциях, которые вы напишите.
Это нормально. Не обязательно вся информация всегда нужна.

Проверьте работу написанных функций на примере каких-нибудь входных данных.
*/

fun main() {
    val driver1 = Driver("Kirill", 23, 7)
    val driver2 = Driver("Oleg", 27, 8)
    val carBMV = Car("BMV", 100)
    val carAudi = Car("Audi", 300)

    val result = caring(driver1)
    val result1 = caring(driver2)

    val resultAuto = carSharing(carBMV, driver1)
    val resultAuto2 = carSharing(carBMV, driver2)

    println(result)
    println(result1)
    println(resultAuto)
    println(resultAuto2)
}

fun caring(driver: Driver): String {
    val userStatus = when {
        driver.age >= 26 && driver.experience >= 6 -> "Доступны все авто"
        driver.age >= 21 && driver.experience >= 2 -> "Доступны все авто кроме Audi и BMW"
        else -> "Услуги каршеринга недоступны"
    }
    return userStatus
}

fun carSharing(car: Car, driver: Driver): Boolean {
    val userStatus = when (car.carBrand) {
        "Audi" -> !(driver.age < 26 || driver.experience < 6)

        "BMV" -> !(driver.age < 26 || driver.experience < 6)

        else -> false
    }
    return userStatus
}

data class Driver(val name: String, val age: Int, val experience: Int)

data class Car(val carBrand: String, val rentalPrice: Int)