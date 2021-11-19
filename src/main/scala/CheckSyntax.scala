object CheckSyntax {

  def cube(num: Int) = num * num * num

  def test: Array[Int] = {
    Array(1,2,3).map(f => {
      println(f)
      1
    })
  }
}
