fun main(){
    val FireWall = Spell("Огненная стена", 5, 3, "\u26A1")
    FireWall.cast()
    val IceSheet = Spell("Ice Sheet", 6,7, "❄")
    IceSheet.cast()
    val spl = Spell("a", 3,4,"x")
    println(spl)
}

