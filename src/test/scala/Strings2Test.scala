import Day4.StringsTwo
import org.scalatest.FlatSpec

class Strings2Test extends FlatSpec {
  "StringsTwo.result " should "return a String " in {
    assert(StringsTwo.result("Ha", "llo", 'a', 'e').isInstanceOf[String])
  }
  it should "print Hello" in {
    assert(StringsTwo.result("Ha", "llo", 'a', 'e').equals("Hello"))
  }
}
