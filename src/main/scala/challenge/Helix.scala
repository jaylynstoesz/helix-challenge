package challenge

import common.algorithms.AlgorithmA

object Helix {
  def main(args: Array[String]): Unit = {
    runAlgorithmA("Hello Helix!")
  }

  def runAlgorithmA(input: String) = {
    print(AlgorithmA.run[String](input))
  }
}
