package World

class SpecialOperation(title: String, reward: Int,
    val pequiredClearance: Int, val IsConvert: Boolean): Mission(title,reward){
    fun ShowReward(){
        println("ребуемый допуск: $pequiredClearance")
        println("Режим секретности ${if (IsConvert) "Секретный" else "Обычный"}")
    }
    }