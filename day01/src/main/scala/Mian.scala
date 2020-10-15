/**
  * @Author: atao  
  * @Date: 2020-10-15-00:00  
  * @Description:
  * @version: 1.0
  */
object Mian {

  def main(args: Array[String]): Unit = {
    print("aaaa")
    new TestDay01("aaaaa").printTest();
  }
}

class TestDay01{

  var name:String = "";

  def printM: Unit ={

  }

  def this(xname:String){
    this();
    name = xname;
  }

  def printTest(): Unit ={
    println(name)
  }
}