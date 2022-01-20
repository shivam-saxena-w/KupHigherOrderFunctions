import org.scalatest.funsuite.AnyFunSuite

class FunctionImplementationTest extends AnyFunSuite {
  val functionObj = new FunctionImplementations

/************* Tests for squareList() function  *************/

  test("squareList() function test"){
    val listInput = List(1,2,3)
    assert(functionObj.squareList(listInput) == List(1,4,9))
  }

  test("squareList() function test for empty list"){
    val listInput = List()
    assert(functionObj.squareList(listInput) == List())
  }

/********** Tests for squareListUsingMap() function  **********/

  test("squareListUsingMap() function test"){
    val listInput = List(1,2,3)
    assert(functionObj.squareListUsingMap(listInput) == List(1,4,9))
  }

  test("squareListUsingMap() function test for empty list"){
    val listInput = List()
    assert(functionObj.squareListUsingMap(listInput) == List())
  }
}