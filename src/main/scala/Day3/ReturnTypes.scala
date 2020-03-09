package Day3

class Word(var name: String)

object ReturnTypes extends App{
def returnWordType() : String = {
  def word = new Word("World!")
  "Hello" + word.name
}
  returnWordType()
}
