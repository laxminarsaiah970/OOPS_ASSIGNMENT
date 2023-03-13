import java.math.RoundingMode
import java.text.DecimalFormat

interface Calculator{
    abstract fun division(a:Int,b:Int):Double
}

abstract class  Variables  //abstract class.
{
    // abstract method.
    abstract fun addition():Int
    open fun substraction(a:Int, b:Int):Int
    {
        return  a-b
    }

}
class Division:Calculator{
    override fun division(a: Int, b: Int): Double {
        return a/b.toDouble()
    }

}
// Variables  class inherited to Addition class.
class Addition:Variables(),Calculator{


    private var number1:Int=0
        get()=field //Encapsulation.

    fun updateNumber1(n:Int)
    {
        number1=n
    }
    private var number2:Int=0
        get()=field //Encapsulation.
    fun updateNumber2(m:Int)
    {
        number2=m
    }
    override  fun addition(): Int { //overriding.

        return number1+number2
    }

    override fun substraction(a: Int, b: Int): Int { //overloading
        return a-b
    }
    fun multiplication():Int{  //overloading.
        return number1*number2
    }
    fun multiplication(a:Double,b:Double):Double{ //overloading.
        return a*b
    }

    override fun division(a:Int,b:Int) :Double{
        return a/b.toDouble()
    }

}
fun main(args: Array<String>) {
    val sum=Addition() //objection creation
    sum.updateNumber1(6) // assigning value
    sum.updateNumber2(8)
    println(sum.addition()) // calling method through Addition object
    println(sum.multiplication())
    println(sum.substraction(8,7))
    println(sum.division(4,2))
    val div:Calculator=Division()
    println(div.division(8,4))
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.CEILING
    println(df.format(sum.multiplication(4.5,5.7)))


}