package array.com.cn

/**
  * Created by Administrator on 2017/8/21.
  */
//荷兰国旗问题，转换成000111222，仿造快速排序
object HollandFlag {
  def main(args: Array[String]): Unit = {
    val flag = "0121102012020"
    Holland(flag)
  }
  def Holland(flag:String): Unit ={
    val c = flag.toCharArray
    var begin = 0
    var end = c.length-1
    var current = 0
    var temp = 'x'
    while(current<=end){
      //c(cur)==2 则c(cur)与c(end)进行交换，而且end--,cur不变
      if(c(current)=='2'){
        temp = c(current)
        c(current) = c(end)
        c(end) = temp
        end = end-1
      }
      //c(current)==1 cur++ beigin不变，end不变
      else if(c(current)=='1'){
        current = current+1
      }
      //c(cur)==0 如果begin==cur则begin++,cur++,
      // 否则c(cur)与c(begin)交换begin++,cur不变
      else{
        if(current==begin){
          begin = begin + 1
          current = current + 1
        }else{
          temp = c(current)
          c(current) = c(begin)
          c(begin) = temp
          begin = begin+1
          current = current + 1 //可以不要，是优化，因为换位置之后c(cur)==1就可以继续上面的else if操作
        }
      }
    }
    c.foreach(x=>(print(x)))

  }

}
