package dsa.tree;
import java.util.*;
public class Tree {
    // public static void print(TreeNode<Integer> root)
    // {
    //     if(root==null) return;
    //     System.out.print(root.data+":");
    //     if(root.left!=null) System.out.print("L=> "+root.left.data+",");
    //     if(root.right!=null) System.out.print(" R=> "+root.right.data+",");
    //     System.out.println();
    //     print(root.left);
    //     print(root.right);
    //     // System.out.println(root.data);
    // }
    public static int countNodes(TreeNode<Integer> root)
    {
        if(root==null) return 0;
        return 1+countNodes(root.right)+countNodes(root.left);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        TreeNode<Integer> root=new TreeNode<>(5);    
        TreeNode<Integer> right=new TreeNode<Integer>(7);
        TreeNode<Integer> r1=new TreeNode<Integer>(9);
        TreeNode<Integer> r2=new TreeNode<Integer>(11);
        TreeNode<Integer> l1=new TreeNode<Integer>(4);
        TreeNode<Integer> l2=new TreeNode<Integer>(3);
        TreeNode<Integer> l3=new TreeNode<Integer>(3);
        root.right=right;
        root.left=l1;
        l1.right=l2;
        right.right=r1;
        r1.left=r2;
        l2.left=l3;
        System.out.println(countNodes(root));
    }
}
