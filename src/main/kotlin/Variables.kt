abstract class  Variables :Calculator //abstract class.
{
    // abstract method.
    abstract fun addition():Int
    open fun substraction(a:Int, b:Int):Int
    {
        return  a-b
    }

}