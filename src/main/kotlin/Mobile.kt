open class Mobile(val marka: String, val cena: Double, val pamyat: Int) {

    fun Q1 (cena: Double, pamyat:Int): Double{
        val Q = pamyat/cena
        return Q
    }
}