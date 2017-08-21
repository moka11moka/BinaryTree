package array.com.cn

/**
  * Created by Administrator on 2017/8/21.
  */
//求一个序列中和为10的子数组
object subArraySum {
  val c = Array(1,2,3,4,5)
  val sum = 6
  def main(args:Array[String]): Unit ={
    var b =  new Array[Boolean](5)
    EnumNumber(b,0,0)
  }
  def EnumNumber(b:Array[Boolean],i:Int,has:Int): Unit ={
    if(i>=c.length)return  //这是查找结束后的出口，必须要有,否则数组会越界
    if(c(i)+has==sum){
      b(i) = true
      print(c(i)+" ")
      b(i)=false
    }
    b(i) = true
    EnumNumber(b,i+1,has+c(i))
    b(i) = false
    EnumNumber(b,i+1,has)
  }

}
