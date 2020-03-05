package Day4

object Strings extends App {
  def lastChar( word : String, amount : Int) : String = {
    word.takeRight(amount)
  }
  println( lastChar ("Blake" , 4))  }
