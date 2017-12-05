package main

import domain.Review
import org.scalatest.FunSuite

class MainTest extends FunSuite {

  test("testMostActiveUsers size") {
    val mostActiveUsers = Main.mostActiveUsers(
      List(
        Review(1, "p1", "u1", "user1", 1, 1, 4, 0L, "", ""),
        Review(1, "p1", "u3", "user3", 1, 1, 4, 0L, "", ""),
        Review(1, "p1", "u2", "user2", 1, 1, 4, 0L, "", ""),
        Review(1, "p1", "u3", "user3", 1, 1, 4, 0L, "", ""),
        Review(1, "p1", "u3", "user3", 1, 1, 4, 0L, "", ""),
        Review(1, "p1", "u2", "user2", 1, 1, 4, 0L, "", "")
      ),
      2
    )
    assert(mostActiveUsers.size == 2)
  }

  test("testMostActiveUsers") {
    val mostActiveUsers = Main.mostActiveUsers(
      List(
        Review(1, "p1", "u1", "user1", 1, 1, 4, 0L, "", ""),
        Review(1, "p1", "u3", "user3", 1, 1, 4, 0L, "", ""),
        Review(1, "p1", "u2", "user2", 1, 1, 4, 0L, "", ""),
        Review(1, "p1", "u3", "user3", 1, 1, 4, 0L, "", ""),
        Review(1, "p1", "u3", "user3", 1, 1, 4, 0L, "", ""),
        Review(1, "p1", "u2", "user2", 1, 1, 4, 0L, "", "")
      ),
      2
    )
    assert(mostActiveUsers.equals(List("user3", "user2")))
  }

  test("testMostCommentedFoodItems size") {
    val mostCommentedFoodItems = Main.mostCommentedFoodItems(
      List(
        Review(1, "p1", "u1", "user1", 1, 1, 4, 0L, "", ""),
        Review(1, "p1", "u3", "user3", 1, 1, 4, 0L, "", ""),
        Review(2, "p1", "u2", "user2", 1, 1, 4, 0L, "", ""),
        Review(3, "p1", "u3", "user3", 1, 1, 4, 0L, "", ""),
        Review(3, "p1", "u3", "user3", 1, 1, 4, 0L, "", ""),
        Review(3, "p1", "u2", "user2", 1, 1, 4, 0L, "", "")
      ),
      2
    )
    assert(mostCommentedFoodItems.size == 2)
  }

  test("testMostCommentedFoodItems") {
    val mostCommentedFoodItems = Main.mostCommentedFoodItems(
      List(
        Review(1, "p1", "u1", "user1", 1, 1, 4, 0L, "", ""),
        Review(1, "p1", "u3", "user3", 1, 1, 4, 0L, "", ""),
        Review(2, "p1", "u2", "user2", 1, 1, 4, 0L, "", ""),
        Review(3, "p1", "u3", "user3", 1, 1, 4, 0L, "", ""),
        Review(3, "p1", "u3", "user3", 1, 1, 4, 0L, "", ""),
        Review(3, "p1", "u2", "user2", 1, 1, 4, 0L, "", "")
      ),
      2
    )
    assert(mostCommentedFoodItems.equals(List(3L, 1L)))
  }

  test("testMostUsedWordsInReviews size") {
    val mostUsedWordsInReviews = Main.mostUsedWordsInReviews(
      List(
        Review(1, "p1", "u1", "user1", 1, 1, 4, 0L, "", "I believe I can fly"),
        Review(1, "p1", "u3", "user3", 1, 1, 4, 0L, "", "word1 word2"),
        Review(2, "p1", "u2", "user2", 1, 1, 4, 0L, "", ""),
        Review(3, "p1", "u3", "user3", 1, 1, 4, 0L, "", "word1 word1 word1"),
        Review(3, "p1", "u3", "user3", 1, 1, 4, 0L, "", ""),
        Review(3, "p1", "u2", "user2", 1, 1, 4, 0L, "", "I can, can can can")
      ),
      2
    )
    assert(mostUsedWordsInReviews.size == 2)
  }

  test("testMostUsedWordsInReviews") {
    val mostUsedWordsInReviews = Main.mostUsedWordsInReviews(
      List(
        Review(1, "p1", "u1", "user1", 1, 1, 4, 0L, "", "I believe I can fly"),
        Review(1, "p1", "u3", "user3", 1, 1, 4, 0L, "", "word1 word2"),
        Review(2, "p1", "u2", "user2", 1, 1, 4, 0L, "", ""),
        Review(3, "p1", "u3", "user3", 1, 1, 4, 0L, "", "word1 word1 word1"),
        Review(3, "p1", "u3", "user3", 1, 1, 4, 0L, "", ""),
        Review(3, "p1", "u2", "user2", 1, 1, 4, 0L, "", "I can, can can can")
      ),
      2
    )
    assert(mostUsedWordsInReviews.equals(List("can", "word1")))
  }

}
