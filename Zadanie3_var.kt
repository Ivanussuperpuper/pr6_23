fun main(){
    val Oslotemp = -4.0
    val Stockholmtemp = -13.0
    val Helsinkitemp = -15.0
    val Chelybinsktemp = -13.0
    println("Температура в Челябинске:$Chelybinsktemp")
    println("Температура в столицах:")
    when{
        Oslotemp < Chelybinsktemp -> println("В осло ($Oslotemp) холоднее чем в Челябинске")
        else -> println("В осло($Oslotemp) теплее или так же как в Челябинске")
    }
    when{
        Stockholmtemp < Chelybinsktemp -> println("В Стокгольме ($Stockholmtemp) холоднее чем в Челябинске")
        else -> println("В Стокгольме($Stockholmtemp) теплее или так же как в Челябинске")
    }
    when{
        Helsinkitemp < Chelybinsktemp -> println("В Хельсинках ($Helsinkitemp) холоднее чем в Челябинске")
        else -> println("В Хельсинках($Helsinkitemp) теплее или так же как в Челябинске")
    }
}