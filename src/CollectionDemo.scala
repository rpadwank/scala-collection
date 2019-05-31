import scala.collection.mutable
import scala.io.Source

/**
  * Created by sashetye on 31-05-2019.
  */
object CollectionDemo extends App{

  case class Employee(id: Int, name: String, salary: Double)

  val records: mutable.HashMap[Int, Employee]=mutable.HashMap()
  val fileName="C:\\Users\\sashetye\\IdeaProjects\\Collection\\src\\data"
  val fileSource=Source.fromFile(fileName)
  for(line <- fileSource.getLines()) {
    val words = line.split(" ")
    val emp = Employee(words(0).toInt, words(1), words(2).toDouble)
    records.put(words(0).toInt, emp)
  }
  records.keys.foreach{
    key=>println(records(key).id+"  "+records(key).name+" "+records(key).salary)

  }


}
