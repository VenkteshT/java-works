package dsa.tree;
public class TreeNode<T>{
    public T data;
    TreeNode<T> left;
    TreeNode<T> right;
    public TreeNode(T data)
    {
        this.data=data;
    }
}