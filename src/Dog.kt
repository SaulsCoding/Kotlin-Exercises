class Dog : Animal(name = "Dog") {
    //Access to the properties defined in the parent class

    override fun makeSounds() {
        println("WUFF!!!")
    }
}