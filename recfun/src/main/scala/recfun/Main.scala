package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0) 1
    else if (c == r) 1
    else if (c > 0 && c < r) r
    else 0 // out of bounds
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def loop(lst: List[Char], acc: Int): Int = {
      if (lst.isEmpty) acc
      else if (acc < 0) - 1
      else {
        val hd = lst.head
        val tl = lst.tail
        if (hd == '(') loop(tl, acc+1)
        else if (hd == ')') loop(tl, acc-1)
        else loop(tl, acc)
      }
    }
    val result = loop(chars, 0)
    if (result == 0) true
    else false
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
