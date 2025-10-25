package pets

fun main(){
    var rslt = listOf(
        Wolf("Fernir"),
        Cat.cat("Murzik"),
        Eagle.Eagle("skyvind"),
        Bear.Bear("Balu")
    )

    for (i in rslt ){
        i.describe()
        i.makeSound()
        println()
    }
}