//Prevents from creating instance of Animal class
abstract class Animal(
    val name : String,
    val legCount : Int = 4
) {
    //Block of code that will be executed when every we create a instance of this class
    init{
        println("Hello, my name is $name")
    }

    abstract fun makeSounds()
}