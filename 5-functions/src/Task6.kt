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
    val vosrast = 23
    val staj = 7

    val result = carSharing(vosrast,staj)
    println(result)
}

fun carSharing(age: Int, experience: Int):Boolean{
    val userStatus = when {
        age >= 26 && experience >= 6 -> true
        age >= 21 && experience >= 2 -> true
        else -> false
    }
    return userStatus
}