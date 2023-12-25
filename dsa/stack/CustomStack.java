package dsa.stack;

public class CustomStack {
    private int[] arr;
    private int index=0;
    public CustomStack(int size)
    {
        arr=new int[size];
    }
    public void add(int data)
    {
        if(index>=arr.length)
        {
            System.out.println("stack is overFlow!! can't add el: "+data);
            return;
        }
        arr[index++]=data;
    }
    public int top()
    {
        return arr[index-1];
    }
    public void pop()
    {
        if(index<0)
        {
            System.out.println("Stack in underFlow!!");
            return;
        }
        arr[--index]=0;
    }
    public boolean isEmpty()
    {
        return index==0;
    }
    public int size()
    {
        return index;
    }
    public void printStack()
    {
        int i=0;
        while(i<index)
        {
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
    }
}
