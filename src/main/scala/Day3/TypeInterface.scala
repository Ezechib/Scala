package Day3

object TypeInterface extends App {

  def returnAnyInput(name:Any):Any=name

  println(returnAnyInput(name = "Blake"))
  println(returnAnyInput(name = 70))
  println(returnAnyInput(name = 200.00))
}
