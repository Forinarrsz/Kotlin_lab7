import World.SpecialOperation

fun main(){

    println("Enter name Quest:")
    var title = readln()
    println("enter time: ")
    var duration = readln()

    val qst = Quest("Поиск артефакта", 3,800,"Средний")
    val cnrt = Cotract("Защита каравана", "Гильдия купцов", "Охрана груза", 1200)
    val specop = SpecialOperation("Операция: Тень", 2500, 2, true)

    println("Информация о квесте")
    println("Название: ${qst.title}")
}