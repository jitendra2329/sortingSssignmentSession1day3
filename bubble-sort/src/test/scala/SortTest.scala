import com.knoldus.BubbleSort
import org.scalatest.funsuite.AnyFunSuite

import scala.collection.immutable.Seq
class SortTest extends AnyFunSuite {
  val bubbleSort = BubbleSort
  val sortedSequence: Seq[Int] = bubbleSort.bubbleSort(Seq(5, 1, 4, 2, 8))
  val expectedSortedSequence = List(1, 2, 4, 5, 8)

    test("case : Bubble sort test"){
      assert(sortedSequence match {
        case List(1, 2, 4, 5, 8) => true
        case _ => false
      })
    }
}
