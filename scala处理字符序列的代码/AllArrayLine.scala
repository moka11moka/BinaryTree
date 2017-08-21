package string.com.cn

/**
  * Created by Administrator on 2017/8/19.
  */
//不重复序列的全排序，递归方法
object AllArrayLine {
  var count = 0
  def main(args: Array[String]): Unit = {
    val c = "1234".toCharArray
    getPermutation(c,0,4)
    c.foreach(x=>print(x))
  }
  //swap

  def getPermutation(c:Array[Char],from:Int,to:Int): Unit ={
    val char = c
    var temp = '0'

    if(from==to){
      count = count + 1
      print(count+":\t")
      c.foreach(x=>print(x))
      println()
    }

    for(i <- from until to){
      temp = char(i)
      char(i) = char(from)
      char(from) = temp
      getPermutation(c,from+1,to)
      temp = char(i)
      char(i) = char(from)
      char(from) = temp
    }
  }
}
