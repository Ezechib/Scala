import Day3.TypeInterface
import org.scalatest.FlatSpec

class TypeInterfaceTest extends FlatSpec {
  "TypeInterface.returnAnyInput" should "return a String" in {
    assert(TypeInterface.returnAnyInput("Blake").isInstanceOf[String])
  }
  it should "print Blake" in {
    assert(TypeInterface.returnAnyInput("Blake").equals("Blake"))
  }

    "TypeInterface.returnAnyInput" should "return a Integer" in {
      assert(TypeInterface.returnAnyInput(70).isInstanceOf[Integer])
    }
  it should "print 70" in {
    assert(TypeInterface.returnAnyInput(70).equals(70))
  }

      "TypeInterface.returnAnyInput" should "return a Double" in {
      assert(TypeInterface.returnAnyInput(200.00).isInstanceOf[Double])
      }
  it should "print 200.00" in {
    assert(TypeInterface.returnAnyInput(200.00).equals(200.00))
  }

}

