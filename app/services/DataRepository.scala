package services

 trait DataRepository[T] {
   def save(obj:T): Unit
   def  getAll():Stream[T]
   def find(id:String):T
}
