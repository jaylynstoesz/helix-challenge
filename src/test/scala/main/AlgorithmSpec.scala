package main

import common.algorithms.AlgorithmA
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class AlgorithmSpec extends FunSuite {
  val pattern: String = ""

  test("runs algorithm a") {
    assert(AlgorithmA.run[String]("c").matches("c"))
  }
}
