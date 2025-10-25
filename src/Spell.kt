import magic.MagicEffect

class Spell(name: String, val width: Int = 0, val height: Int =0, symbol: String): MagicEffect(name, symbol, 10)