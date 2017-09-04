package tree.com.cn;

/**
 * Created by Guoxiang on 2017/9/4.
 */

//树节点定义
public class Node {
    public String data=null;
    public Node left=null;
    public Node right=null;
    public static boolean flag;
    public Node(){}
    public Node(String data){
        this.left = null;
        this.right = null;
        this.data = data;
    }
}
