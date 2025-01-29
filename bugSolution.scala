```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    try {
      if (y == 0) {
        throw new ArithmeticException("Division by zero")
      } else {
        x / y
      }
    } catch {
      case e: ArithmeticException => {
        println("Error: "+ e.getMessage())
        0 //or handle it appropriately
      }
      case e: Exception => {
        println("An unexpected error occurred: "+e.getMessage())
        0
      }
    }
  }
}
```