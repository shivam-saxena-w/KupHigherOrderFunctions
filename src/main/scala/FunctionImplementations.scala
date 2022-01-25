class FunctionImplementations {
  def squareList(listInput: List[Int]): List[Int] =
    listInput match {
      case List() => listInput
      case element :: elements => element * element :: squareList(elements)
    }

  def squareListUsingMap(listInput: List[Int]): List[Int] =
    // Map function will do for every element in List say 'element', new 'element' will be element * element
    listInput map(element => element * element)

}