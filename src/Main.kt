fun main() {
    print(depositProfit(100,20,170))
}

fun depositProfit(deposit: Int, rate: Int, threshold: Int): Int {
    var theProfit=deposit.toFloat()
    var count=0
    while(theProfit<threshold){
        var yearProfit=(theProfit*((rate.toFloat()/100.0F)))
        theProfit+=yearProfit
        count++
    }
    return count
}
