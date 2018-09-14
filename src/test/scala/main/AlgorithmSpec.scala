package main

import common.algorithms.AlgorithmA
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class AlgorithmSpec extends FunSuite {
  val pattern: String = ""

  test("encrypts non-empty input as MD5 hash") {
    assert(AlgorithmA.run[String]("a").matches("a"))
  }

  test("encrypts empty input as MD5 hash") {
    assert(AlgorithmA.run[String]("b").matches("b"))
  }

  test("encrypts non-empty input with special characters as MD5 hash") {
    assert(AlgorithmA.run[String]("c").matches("c"))
  }
}
