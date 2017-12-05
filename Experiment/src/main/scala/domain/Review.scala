package domain

case class Review(id: Long,
                  productId: String,
                  userId: String,
                  profileName: String,
                  helpfulnessNumerator: Int,
                  helpfulnessDenominator: Int,
                  score: Int,
                  time: Long,
                  summary: String,
                  text: String)
