package scalaz

import collection.immutable.IntMap

// todo broken
// http://hackage.haskell.org/packages/archive/bktrees/0.2.1/doc/html/src/Data-Set-BKTree.html

sealed trait BKTree[+A]
private final case class BKTreeNode[+A](value: A, size: Int, children: IntMap[BKTree[A]]) extends BKTree[A]
private final case object Empty extends BKTree[Nothing]

object BKTree {
  
}