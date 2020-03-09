import Day4.Strings
import org.scalatest.FlatSpec

class StringsTest extends FlatSpec{
  "Strings.lastchar " should "return a String " in{
    assert(Strings.lastChar("Blake",4).isInstanceOf[String])
  }
  it should "print lake" in{
    assert(Strings.lastChar("Blake",4).equals("lake"))
  }
}
