class hero {
    var name: String = "еизвестный"
    var gender: String = "не указан"
    var role: String = "бродяга"
    var hp: Int = 100
    var mp: Int = 100
    fun hello() {
        println("i`m $name, My journey is just beginning.")
    }

    fun status() {
        println("name - $name, class - $role, hp - $hp, mp $mp")
    }

    fun meditate() {
        println("$name медитирует")
        mp += 20
        println("мана восстановлена, текущая  = $mp")
    }
    fun dead(){
        if (hp == 0){
            println("hero dead")
        }}
    fun takedamage(amount: Int) {
        println("$name получил урон $amount")
        hp -= amount
        if (hp>0)
            println("текущее здоровье $hp")
        if (hp ==0){
            dead()
        }
    }


    fun castspeel() {
        println("hero use magic")
        mp -= 10
        if (mp == 0) {
            println("using magic blocked")}}

    fun CastSpellOn(enemy: Enemy, spellname:String,damage:Int){
        println("$name использует заклинание $spellname против ${enemy.name}")
    }



}
