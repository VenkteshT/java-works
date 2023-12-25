package dsa.Queue;

public class UseQueue {
    public static void main(String[] args) {
        MyQueue q=new MyQueue(5);
        for(int i=1;i<=5;i++)
        {
            q.enQueue(i);
        }
        while(!q.isEmpty())
        {
            System.out.println(q.dQueue());
        }
        System.out.println(q.isEmpty()+" "+q.front());
    }
}
