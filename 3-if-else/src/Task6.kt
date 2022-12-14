/*
Те же требования каршеренга, что и в задаче 5.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

На вход подаются: марка авто(String), возраст и стаж пользователя.
Определить доступно ли ему это авто или нет.
*/

fun main() {
    val markaAvto = readLine()!!.toString()
    val vozrast = readLine()!!.toInt()
    val stazh = readLine()!!.toInt()

    when(markaAvto){
        "Audi" -> if (vozrast < 26 || stazh < 6) {
            println("авто не доступен")
        }else{
            println("авто доступен")
        }
        "BMV" -> if (vozrast < 26 || stazh < 6) {
            println("авто не доступен")
        }else{
            println("авто доступен")
        }
    }
}