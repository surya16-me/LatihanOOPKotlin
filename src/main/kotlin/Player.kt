open class Player (
    private var _name: String,
    private var _hp: Int,
    private var _atk: Int
){

    var hp: Int
        get() = _hp
        set(newHp) {
            _hp = newHp
        }

    var name: String
        get() = _name
        set(newName) {
            _name = newName
        }

    var atk: Int
        get() = _atk
        set(newAtk) {
            _atk = newAtk
        }

    open fun status(){

        println("Class\t: $name")
        println("HP\t\t: $hp" )
        println("Attack\t: $atk")
    }

    open fun attack(target: Player) {
        println("$name is attacking ${target.name}")
        target.getHit(atk)
    }

    open fun getHit(damage: Int) {
        if (hp > 0){
            hp -= damage
            if (hp <= 0){
                hp = 0
                println("$name die")
            }
        }else{
            println("$name has been die")
        }

    }

}