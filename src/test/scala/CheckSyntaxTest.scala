import org.scalatest.funsuite.AnyFunSuite

class CheckSyntaxTest extends AnyFunSuite {
  test("CheckSyntax.cube") {
    assert(CheckSyntax.cube(3) === 27)
  }

  test("CheckSyntax.test") {
    assert(CheckSyntax.test === Array(1,1,1))
    1.toString
  }

  def solution(a: Array[Int]): Int = {
    var counter = 0
    var passed = 0
    a.reverse.takeWhile(_ => 0 <= passed).foreach(elem => {
      if(elem == 1) { counter += 1 } else if (elem == 0) {
        if(passed >= 1000000000) { passed = -1 } else { passed += counter }
      }
    })
    passed
  }
}
