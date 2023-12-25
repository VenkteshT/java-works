package dsa.GenricTree;
import java.util.*;
public class GNode <T> {
    T data;
   ArrayList<GNode<T>> list;
    public GNode()
    {

    }
    public GNode(T data)
    {
        this.data=data;
        this.list=new ArrayList<>();
    }    

    public void printPreOrder(GNode<T> node)
    {
        System.out.print(node.data+": ");
        for(int i=0;i<node.list.size();i++)
        {
            System.out.print(node.list.get(i).data+" ");
        }
        System.out.println();
        for(int i=0;i<node.list.size();i++)
        {
            printPreOrder(node.list.get(i));
        }
    }
    public void printLevelWise(GNode<T> node)
    {
        int height=0;
        Queue<GNode<T>> q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
            GNode<T> temp=q.remove();
            System.out.print(temp.data+": ");
            int i=0;
            while(i<temp.list.size()){
                System.out.print(temp.list.get(i).data+" ");
                q.add(temp.list.get(i));
                if(i==temp.list.size()-1) height++;
                i++;
            }
            System.out.println("height:"+height);
        }
    }
}
