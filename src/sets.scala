import scala.collection.{immutable, mutable}

object sets extends App {
  val set = Set(1,2,2,2,3)
  println(set.apply(2))
  println(set(2))
  println(set.contains(3))
  println(set contains 3)
  println(set.contains(6))
  println(set contains 6)

  println(set - 2)
  println(set -- Set(1,2))

  println(set + 8)
  println(set ++ Set(1,2,4,5,6,7))

  println(set intersect Set(3,4))
  println(set & Set(3,4))
  println(set union Set(3,4))
  println(set | Set(3,4))
  println(set diff Set(3,4))
}


object msets {
  val mset = mutable.Set(1,2,3)
  mset += 4
  mset

  mset ++= Set(4,5)
  mset - 5

  mset.retain { x => x % 2 == 0}
  mset
}

object msetsSorted {
  val set = Set(1,2,3,4,5)

  val sset = immutable.SortedSet(1,2,3,4,5)

  val mayorAmenor = Ordering.fromLessThan[Int](_ > _)

  val sortedSetInverso = immutable.SortedSet.empty(mayorAmenor) ++ set

}
