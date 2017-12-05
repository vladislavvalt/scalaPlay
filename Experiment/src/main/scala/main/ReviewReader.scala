package main

import domain.Review
import purecsv.safe._

import scala.io.Source
import scala.util.Success

object ReviewReader {

  def read(path: String = "Reviews.csv"): List[Review] =
    CSVReader[Review]
      .readCSVFromReader(Source.fromResource(path).reader(), skipHeader = true)
      .collect { case Success(review) => review }
      .toList

}
