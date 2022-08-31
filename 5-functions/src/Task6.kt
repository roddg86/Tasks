/*
Те же требования каршеренга, что и в задаче 5.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

Написать функцию, принимающую на вход марку авто(String), возраст и стаж пользователя и возвращающую
Boolean (доступно ему это авто или нет)

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/


fun main() {
    val age = 27
    val experience = 7
    val carBrand = readLine()!!.toString()

    val result = carSharing(carBrand, age, experience)
    println(result)
}

fun carSharing(carBrand: String, age: Int, experience: Int): Boolean {
    val userStatus = when (carBrand) {
        "Audi" -> !(age < 26 || experience < 6)

        "BMV" -> !(age < 26 || experience < 6)

        else -> false
    }
    return userStatus
}