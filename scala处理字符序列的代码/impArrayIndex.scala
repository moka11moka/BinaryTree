package string.com.cn
import scala.util.control.Breaks._

/**
  * Created by Administrator on 2017/8/19.
  */
//全排列的提高版本
object impArrayIndex {
  var c = "1223".toCharArray //全局变量，不然每次递归都会被赋初值
  var count = 0
  def main(args: Array[String]): Unit = {
    getPermutation(0,3)

  }
  //考虑出现重复字符情况全排列
  def getPermutation(from:Int,to:Int): Unit ={
    var temp = '0'
    if(from==to){
      count = count + 1
      print(count+":\t")
      for(i <- 0 to to){
        print(c(i))
      }
      println()
    }
    for(i <- from to to){
      var isRepeat = true
      //如果有重复的则不进行替换
      breakable{
        for(j <- from until i){
          if(c(j)==c(i)){
            isRepeat = false
            break()
          }
        }
      }
      breakable{
        if(isRepeat==false){
          break()     //循环内的breakable相当于continue
        }
        temp = c(i)
        c(i) = c(from)
        c(from) = temp
        getPermutation(from+1,to)
        temp = c(i)            //记得交换位置的数字换回来
        c(i) = c(from)
        c(from) = temp
      }
    }

  }
}
