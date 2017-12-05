package main

class ReviewReaderTest extends org.scalatest.FunSuite {

  test("Should read sample") {
    val reviews = ReviewReader.read("review_sample.csv")
    assert(reviews.size == 2)
  }

  test("Should read sample 2") {
    val reviews = ReviewReader.read("review_sample.csv")
    val first = reviews.head
    assert(first.id == 1)
    assert(first.score == 5)
  }
}
