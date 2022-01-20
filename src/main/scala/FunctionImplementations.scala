class FunctionImplementations {
  def squareList(xs: List[Int]): List[Int] =
    xs match {
      case List() => xs
      case y :: ys => y * y :: squareList(ys)
    }

  def squareListUsingMap(xs: List[Int]): List[Int] = {
    // Map function will do for every element in List say 'x', new 'x' will be x * x
    xs map(x => x * x)
  }
}