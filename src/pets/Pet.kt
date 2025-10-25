package pets

open  class  Pet(
        val name: String = "",
        val maxHealth: Int = 0,
        val speed: Int  = 0
){
    fun describe(){
        println("Name: $name")
        println("Health: $maxHealth")
        println("speed: $speed")
    }
    fun makeSound(){
        println("$name подаёт голос")
    }
}