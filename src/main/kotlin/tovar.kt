open class Tovar(val name: String, val cena: Double, val kol: Int) {

    fun QQ(cena:Double,kol:Int): Double{
        var Q = cena/kol
        return Q
    }
}