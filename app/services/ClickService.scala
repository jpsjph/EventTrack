package services

import model.EventCapture
import org.mongodb.scala.bson.collection.immutable.Document

class ClickService(connection: MongoConnection) {

  def saveEvent(data: List[EventCapture]) {
    val collection = connection.getCollection("Product", "events")
    val documents = data.map(doc => Document("eventId" -> doc.eventId,
      "content" -> doc.content,
      "httpStatus" -> doc.httpStatus,
      "date" -> doc.date,
      "userAgent" -> doc.userAgent))
    collection.insertMany(documents)
  }

}
