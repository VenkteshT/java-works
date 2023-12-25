package dsa.Queue;

public class MyQueue {
    private int arr[];
    private int front;
    private int rear;
    private int size=0;
    public MyQueue(int size)
    {
        front=0;
        rear=0;
        arr=new int[size];
    }
    public boolean isEmpty()
    {
        return size==0;
    }   
    public void enQueue(int data)
    {
        if(arr.length==size) return;
        arr[rear]=data;
        rear=(rear+1)%arr.length;
        size++;
    }
    public int dQueue()
    {
        if(size<=0) return -1;
        int t=arr[front];
        arr[front]=0;
        front=(front+1)%arr.length;
        size--;
        return t;
    }
    public int front()
    {
        return arr[front];
    }
}
