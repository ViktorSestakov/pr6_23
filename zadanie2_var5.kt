fun main(){
    try {
        val number = readLine()!!.toInt()

        when {
            (number == 111) -> println("Все цифры одинаковые в числе " + number)
            (number == 222) -> println("Все цифры одинаковые в числе " + number)
            (number == 333) -> println("Все цифры одинаковые в числе " + number)
            (number == 444) -> println("Все цифры одинаковые в числе " + number)
            (number == 555) -> println("Все цифры одинаковые в числе " + number)
            (number == 666) -> println("Все цифры одинаковые в числе " + number)
            (number == 777) -> println("Все цифры одинаковые в числе " + number)
            (number == 888) -> println("Все цифры одинаковые в числе " + number)
            (number == 999) -> println("Все цифры одинаковые в числе " + number)

            else -> println("Цифры разные в числе " + number)
        }
    }catch (e:Exception){
        println("Неверный формат данных")
    }
}