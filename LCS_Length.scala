/**
  * Created by Administrator on 2017/8/20.
  */
object LCS_Length {
  def main(args: Array[String]): Unit = {
    val X = "BDCABAB"
    val Y = "CBACBAABA"

    getComString_Length(X,Y)
  }
  def getComString_Length(X:String,Y:String): Unit ={
    var m = X.length
    var n = Y.length
    val sb = new StringBuilder
    val c = Array.ofDim[Int](m+1,n+1)
    for(i <- 1 to m) {
      c(i)(0) = 0
    }
    for(j <- 1 to n){
         c(0)(j) = 0
    }
    for(i<- 1 to m){
      for(j <- 1 to n){
        if(X.charAt(i-1)==Y.charAt(j-1)){
           c(i)(j) = c(i-1)(j-1)+1
        }else{
           c(i)(j) = math.max(c(i)(j-1),c(i-1)(j))
        }
      }
    }
   print("LCS的长度是："+c(m)(n))
    while(m!=0&&m!=0){
      if(X.charAt(m-1)==Y.charAt(n-1)){
        sb += X(m-1)
        m = m-1
        n = n-1
      }else{
          if(c(m)(n-1)>c(m-1)(n)){
             n = n-1
          }else{
            m = m-1
          }
      }
    }
    println()
    print("LCS序列是："+sb.reverse)
  }

}
