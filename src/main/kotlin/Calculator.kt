
    interface Calculator{
        abstract fun division(a:Int,b:Int):Double
        abstract fun addition(a: Int, b: Int):Int
        open fun subtraction(a:Int, b:Int):Int
        {
            return  a-b
        }
    }
