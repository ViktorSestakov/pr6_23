fun main(){
    val money_sis1: Double
    val money_sis2: Double

    try{
        money_sis1 = readLine()!!.toDouble()
        money_sis2 = readLine()!!.toDouble()

        when{
            (money_sis1 > money_sis2) -> {var otv = String.format("%.2f", (money_sis1 - money_sis2)); println("Сестра 1 должна отдать сетсре 2 - $otv р что бы суммы стали равными")}
            (money_sis1 < money_sis2) -> {var otv = String.format("%.2f", (money_sis2 - money_sis1)); println("Сестра 2 должна отдать сетсре 1 - $otv р что бы суммы стали равными")}

            else -> println("Суммы накоплений у обоих сестер одинаковы")
        }
    }catch (e:Exception){
        println("Неверный формат данных")
    }
}