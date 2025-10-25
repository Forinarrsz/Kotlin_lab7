class Itemdz6(val name: String, val type: String, val value: Int) {
    constructor(name: String, type: String):this(name,type,0)

    fun printinfo(){
        println("Название $name")
        println("Тип $type")
        println("стоимость $value")
    }
}