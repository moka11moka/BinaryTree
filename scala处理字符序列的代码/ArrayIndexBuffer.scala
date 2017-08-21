package string.com.cn

/**
  * Created by Administrator on 2017/8/19.
  */
//字符串反转
object ArrayIndexBuffer {
  def main(args: Array[String]): Unit = {
    val s = "HelloWord"
    val c = s.toCharArray
    val c1 = new StringBuilder()
    val c2 = new StringBuilder()
    for(i <- 0 until 2){
      c1 += c(i)
    }
    c1.reverse
    for(i<- 2 until c.length){
      c2 += c(i)
    }
    c2.reverse
    (c1++c2).reverse.foreach(x=>print(x)) //scala的输出
  }
}