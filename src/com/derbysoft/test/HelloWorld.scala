package com.derbysoft.test


/**
 *
 * @author Josling
 * @since 2015/1/28 16:56
 */
object HelloWorld {
  def main(args: Array[String]) {
    println(totalResultOverRange(11, i => i))
    println(totalResultOverRange(11, i => if(i % 2 != 0) i else 0))
  }

  def copyPets[S,D >: S](fromPets:Array[S], toPets:Array[D]) ={

  }

  def totalResultOverRange(number: Int , codeBlock : Int => Int) : Int = {
    var result = 0
    for (i <- 1 to number){
      result += codeBlock(i)
    }

    result
  }

}
