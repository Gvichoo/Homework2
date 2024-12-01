class MatematikuriOperaciebi(){
    fun usg(a:Int,b:Int) :Int{
        if (b == 0){
            return a
        }else{
            return usg(b,a%b)
        }
    }
    fun usj(a: Int,b: Int) : Int{
        if(a == 0){
            return a
        }else{
            return (a*b)/usg(a,b)
        }
    }
    fun contain(a :String){
        if(a.contains("$")){
            println("შეიცავს")
        }else{
            println("არ შეიცავს")
        }
    }

    fun odds(i : Int = 0) : Int{
        if (i == 102) {
            return 0
        } else if (i % 2 == 0) {
            return i + odds(i + 2)
        } else {
            return odds(i + 1)
        }
    }
    fun shebrunebuli(i : String): Int {
        var num5 = i.filter { it.isDigit() }.reversed()
        return num5.toInt()
    }
    fun polindrom(str : String){
        if (str.reversed() == str){
            println("პოლინდრომია")
        }else{
            println("არაა პოლინდრომი")
        }
    }

}



fun main(){
    println("დავალება პირველი.")
    println("მიანიჭე მნიშვნელობა a-ს:")
    val num1 = readln().toInt()
    println("მიანიჭე მნიშვნელობა b-ს:")
    val num2 = readln().toInt()
    val pasuxi = MatematikuriOperaciebi().usg(num1,num2)
    println("a-სა და b-ს უდიდესი საერთო გამყოფი არის  $pasuxi")
    println("\n")

    println("დავალება მეორე.")
    println("მიანიჭე მნიშვნელობა a-ს:")
    val num3 = readln().toInt()
    println("მიანიჭე მნიშვნელობა b-ს:")
    val num4 = readln().toInt()
    val pasuxi2 = MatematikuriOperaciebi().usj(num3,num4)
    println("უმცისერი საერთო ჯერადი არის $pasuxi2")
    println("\n")

    println("დავალება მესამე.")
    println("შეიყვანე მონაცემი:")
    val str1 = readln()
    MatematikuriOperaciebi().contain(str1)
    println("\n")

    println("დავალება მეოთხე.")
    val oddsnum = MatematikuriOperaciebi().odds()
    println("100-მდე ლუწ რიცხვთა ჯამი არის : $oddsnum")
    println("\n")

    println("დავალება მეხუთე.")
    println("შეიყვანე მონაცემი:")
    val num5 = readln()
    val pasuxi5 = MatematikuriOperaciebi().shebrunebuli(num5)
    println(pasuxi5)
    println("\n")

    println("დავალება მეექვსე.")
    println("შეიყვანე მონაცემი:")
    val str2 = readln()
    MatematikuriOperaciebi().polindrom(str2)





}




