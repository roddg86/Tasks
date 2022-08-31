/*
В программе каршеринга в зависимости от возраста и стажа водителя доступны разные авто. Озвучены следующие требования.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.


На вход приходит возраст и стаж водителя. Вывести сообщение о том, может ли он пользоваться каршерингом 
и какие авто ему доступны.
*/

fun main() {
    val age: Int = 23
    val experience: Int = 4

    //вариант 1
/*    if (age>=26 && experience >=6)
        println("Доступны все авто")
    else if(age>=21 && experience>=2)
        println("Доступны все авто кроме Audi и BMW")
    else
        println("Услуги каршеринга недоступны")*/

    //вариант 2
/*    val userStatus = if (age>=26 && experience >=6)
        "Доступны все авто"
    else if(age>=21 && experience>=2)
        "Доступны все авто кроме Audi и BMW"
    else
        "Услуги каршеринга недоступны"

    println(userStatus)*/

    //вариант 3 - самый удачный
    val userStatus = when {
        age >= 26 && experience >= 6 -> "Доступны все авто"
        age >= 21 && experience >= 2 -> "Доступны все авто кроме Audi и BMW"
        else -> "Услуги каршеринга недоступны"
    }

    println(userStatus)
}