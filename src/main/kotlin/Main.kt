fun main() {
    val tovar: Tovar = Tovar("pomidor",50.0,20)
    println("наименование товара - " + tovar.name)
    println("цена товара - " + tovar.cena)
    println("кол-во товара - " + tovar.kol)
    println("функция Q = ${tovar.QQ(50.0,20)}")
    val QP: Qp = Qp(2007,2023)
    println("функция QP = ${QP.QP(2007,2023)}")

    // класс Tovar и класс Qp относится к первой задаче (номер 3)
    // все что ниже, следующая задача (номер 6)

    println()
    val mobile: Mobile = Mobile("Apple",28000.0,256)
    println("марка моб. телефона - " + mobile.marka)
    println("цена телефона - " + mobile.cena)
    println("обьем памяти - " + mobile.pamyat + " ГБ")
    println("функция Q = ${mobile.Q1(28000.0,256)}")
    val sim: SIM = SIM(5000)
    println("функция QP = ${sim.QP(5000)}")
}