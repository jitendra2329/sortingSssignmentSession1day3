package com.knoldus

object BubbleSort extends App {

  def bubbleSort(list: Seq[Int])(implicit env: Int => Ordered[Int]): Seq[Int] = {
    // bubble
    def bubble(originalSequence: Seq[Int], secondSequence: Seq[Int], thirdSequence: Seq[Int]): Seq[Int] = {
      originalSequence match {
        case first :: second :: tail if first > second => bubble(first :: tail, second +: secondSequence, thirdSequence)
        case first :: second :: tail => bubble(second :: tail, first +: secondSequence, thirdSequence)
        case first :: Nil => sort(secondSequence, first +: thirdSequence)
      }
    }

    // sort
    def sort(originalSequece: Seq[Int], thirdSequence: Seq[Int]): Seq[Int] = {
      originalSequece match {
        case Nil => thirdSequence
        case _ => bubble(originalSequece, Nil, thirdSequence)
      }
    }

    sort(list, Nil)
  }

  val lst = Seq(5, 1, 4, 2, 8)
  println(bubbleSort(lst))
}
