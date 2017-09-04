package tree.com.cn;

import java.awt.*;

/**
 * Created by Guoxiang on 2017/9/4.
 */
//创建二叉树
public class BinaryTree {
    private static Node root = null;
    public BinaryTree(){
     root = new Node("root(A)");
    }

    /*
     简单的创建二叉树
     */
    public void createTree(Node root){
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");
        Node G = new Node("G");
        root.left = B;
        root.right = C;
        B.left = D;
        B.right= E;
        C.left = F;
        E.right = G;
    }

    /*
      判断树非空
     */
    private static boolean isEmpty(){
        return root==null;
    }

    /*
     得到树的高度
     */
    public int getHeight(Node root){
        if(root==null){
            return 0;
        }else{
            int i = getHeight(root.left); //递归得到左子树高度
            int j = getHeight(root.right);  //递归得到右子树高度
            return (i>j)?(i+1):(j+1);
        }
    }

    public int getHeight(){
        return getHeight(root);
    }

    /*
    得到节点个数
     */

    public int getNum(Node root){

        if(root==null){
            return 0;
        }else{
            return 1+getNum(root.left)+getNum(root.right);
        }

    }

    public int getNum(){
        return getNum(root);
    }

    /*
    前序遍历
     */
    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    /*
    中序遍历
     */
    public void inOrder(Node root){
        if(root!=null){
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
     }
    }
    /*
    后序遍历
     */

    public void postOrder(Node root){
        if(root!=null){
          postOrder(root.left);
          postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        bt.createTree(root);
        System.out.println("递归前序遍历：");
        bt.preOrder(bt.root);
        System.out.println("\n递归中序遍历：");
        bt.inOrder(bt.root);
        System.out.println("\n递归后序遍历：");
        bt.postOrder(bt.root);

    }

}
