class Spell(var name: String, var width: Int, var height: Int, var symbol: String) {


    fun cast() {
        println("Кастуем $name")
        repeat(height) {
            repeat(width)
            { print(symbol) }
            println()
        }

    }
}