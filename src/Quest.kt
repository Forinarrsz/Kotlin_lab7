import World.Mission

class Quest(
    val title: String,
    val duratton: Int,
    reward: Int,
    val difficulty: String
): Mission(title,reward)