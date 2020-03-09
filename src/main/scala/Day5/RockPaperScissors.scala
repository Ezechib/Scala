package Day5
import scala.util.Random

object RockPaperScissors extends App {

  println("type in rock paper or scissors")
  val input = scala.io.StdIn.readLine()

  val option: List[String] = List("rock", "paper", "scissors")


  val random = new Random
  val randomise = option(random.nextInt(option.length))

  println(randomise)

  }


