package string.com.cn

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
    val b = Array.ofDim[Int](m+1,n+1)
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
            b(i)(j) = 1
        }else{
           if(c(i-1)(j) >=c(i)(j-1)){
             c(i)(j) = c(i-1)(j)
             b(i)(j) = 2
           }else
             c(i)(j) = c(i)(j-1)
             b(i)(j) = 3
        }
      }
    }
   print("LCS的长度是："+c(m)(n))
    println()
    LCS(b,Y,m,n)
  }

  def LCS(b:Array[Array[Int]],Z:String,i:Int,j:Int): Unit ={
     if(i==0||j==0) return
    if(b(i)(j)==1){
       LCS(b,Z,i-1,j-1)
    print(Z.charAt(i-1))
    } else if (b(i)(j)==2){
     LCS(b,Z,i-1,j)
    }else{
      LCS(b,Z,i,j-1)
    }
  }

}
