package services

import org.mongodb.scala.bson.collection.immutable.Document
import org.mongodb.scala.{MongoClient, MongoCollection}

case class MongoConnection(path:String) {

  val connection=MongoClient(path)

  def getCollection(dbName:String,col:String):MongoCollection[Document]={
    connection.getDatabase(dbName).getCollection(col)
  }
}
