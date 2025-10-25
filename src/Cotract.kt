import World.Mission

class Cotract(title: String, val ClientName: String, val TaskDescription: String, reward: Int, val IsUrgent: Boolean = false): Mission(title, reward)