fun main(){
    try {
        val number1 = 124
        val number2 = 357
        val number3 = 999
        println(
            "Последняя цифра числа $number1 является четной: ${
                if (number1 in 100..999) number1 % 10 % 2 == 0 else false
            }"
        )
        println(
            "Последняя цифра числа $number2 является четной: ${
                if (number2 in 100..999) number2 % 10 % 2 == 0 else false
            }"
        )
        println(
            "Последняя цифра числа $number3 является четной: ${
                if (number3 in 100..999) number3 % 10 % 2 == 0 else false
            }"
        )
    }catch (e:Exception){
        println("Неверный формат данных")
    }
}