import Day3.ReturnTypes
import org.scalatest.{FlatSpec, FunSuite}

class ReturnTypesTest extends FlatSpec {
  "ReturnTypes.returnWordType " should "return a String " in{
    assert(ReturnTypes.returnWordType().isInstanceOf[String])
  }
}