import kotlin.test.currentStackTrace

fun main(){
    /*val number1 = readLine() ?: "0"
    val number2 = readLine() ?: "0"
    val result = number1.toInt() + number2.toInt()*/

    //val shoppingList = listOf<String>("Lamborghini", "Penthouse", "Rolex") //immutable list
  /*  val shoppingList = mutableListOf("Lamborghini", "Penthouse", "Rolex")
    shoppingList.add("Ferrari")*/
    //println(shoppingList[3])

    /*var counter = 0
    while(counter < shoppingList.size){
        println(shoppingList[counter])
        counter++
    }*/
    /*for(shoppingItem in shoppingList){
        println(shoppingItem)
    }*/

    //Range of Numbers from 1 to 100
   /* for(i in 1..100){
        println(i)
    }*/

    //Check if x is in the range
    /*val x = 3
    when(x){
        in 1..2 -> println("x is between 1 and 2")
        in 3..10 -> println("x is between 3 and 10")
        else -> {
            println("x is not in the range of 1 to 10")
        }
    }*/
   /* print10Numbers()
    val x = isEven(number = 5)
    println(x)

    val y = 3
    println(y.isOdd())*/

    //val dog = Animal(name = "Dog")
   /* val dog = Dog()
    dog.makeSounds()
    val cat = Cat()
    cat.makeSounds()*/

    //Anonymous Class
    /*val bear = object : Animal("Camembear"){
        override fun makeSounds() {
            println("ROOAR!!!")
        }
    }*/

   /* val number = readLine() ?: "0"
    val parsedNumber = try {
        number.toInt()
    } catch (e: Exception) {
        0
    }

    println(parsedNumber)*/

    val list = listOf("Kotlin", "is", "fun")
    //Lambda Function
    val count = list.count { currentString ->
        currentString.length >= 3
    }
    println(count)
}

fun <T> List<T>.customCount(function: (T) -> Boolean): Int {
    var counter = 0
    for(string in this){
        if(function(string)){
            counter++
        }
    }
    return counter
}

//Extension Function
fun Int.isOdd(): Boolean {
    return this % 2 == 1
}

fun isEven(number: Int = 10): Boolean {
    return number % 2 == 0
}

fun print10Numbers() {
    for(i in 1..10) {
        println(i)
    }
}
