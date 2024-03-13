1.
fun main() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it. ")
    println("When you call a function, you pass arguments for the parameters.")
}
2. 
fun main() { 
    println("New chat message from a friend")
}
3. 
fun main() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}
4.
fun main() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
5.
fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
6.
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    var result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")
}
7.
Step 3 :
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    val result = subtract(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}
// Define add()/subtract() function below this line
fun subtract(firstNumber : Int, secondNumber : Int): Int {
    return firstNumber - secondNumber
}
8.
fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

// Define your displayAlertMessage() below this line.
fun displayAlertMessage(operatingSystem : String, emailId : String): String{
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}
11. 
fun main() {
    println("Have I spent more time using my phone today: ${check(300, 250)}")
    println("Have I spent more time using my phone today: ${check(300, 300)}")
    println("Have I spent more time using my phone today: ${check(200, 220)}")
}
fun check(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}
12.
fun main() {
    printWeatherForCity("Ankara", 27, 31, 82)
    printWeatherForCity("Tokyo", 32, 36, 10)
    printWeatherForCity("Cape Town", 59, 64, 2)
    printWeatherForCity("Guatemala City", 50, 55, 7)
}

fun printWeatherForCity(cityNames: String, valueLow: Int, valueHigh: Int, percentageRain: Int) {
    
    println("City:  $cityNames")
    println("Low temperature:  $valueLow,   High temperature:   $valueHigh")
    println("Chance of rain:   $percentageRain%")
    println()
}

