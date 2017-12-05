package main

import domain.Review

object Main {

  def main(args: Array[String]): Unit = {
    println("main!")
    val reviews = ReviewReader.read()
    mostUsedWordsInReviews(reviews).foreach(println)
  }

  def mostActiveUsers(reviews: List[Review], n: Int = 1000): List[String] = {
    reviews
      .groupBy(_.profileName)
      .map { case (profileName, rs) => (profileName, rs.size) }
      .toList
      .sortBy { case (_, activity) => activity }(Ordering[Int].reverse)
      .take(n)
      .map(_._1)
  }

  def mostCommentedFoodItems(reviews: List[Review], n: Int = 1000): List[Long] = {
    reviews
      .groupBy(_.id)
      .map { case (id, rs) => (id, rs.size) }
      .toList
      .sortBy { case (_, numberOfComments) => numberOfComments }(Ordering[Int].reverse)
      .take(n)
      .map(_._1)
  }

  def mostUsedWordsInReviews(reviews: List[Review], n: Int = 1000): List[String] = {
    reviews
      .map(_.text)
      .flatMap(t => t.split("\\s+"))
      .groupBy(x => x)
      .map { case (w, count) => (w, count.size) }
      .toList
      .sortBy { case (_, numberOfOccurrences) => numberOfOccurrences }(Ordering[Int].reverse)
      .take(n)
      .map(_._1)
  }
}
