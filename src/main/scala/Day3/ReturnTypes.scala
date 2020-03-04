package Day3

class Word(var name: String)

object ReturnTypes extends App{
def ReturnWordType() : Unit = {
  def word = new Word("World!")
  println("Hello" + word.name)
}
  ReturnWordType()
}
