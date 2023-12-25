package dsa.GenricTree;

public class GTree {

    public static void main(String[] args) {
        GNode<Integer> obj=new GNode<>();
        GNode<Integer> n1=new GNode<>(1);
        GNode<Integer> n2=new GNode<>(2);
        GNode<Integer> n3=new GNode<>(3);
        GNode<Integer> n4=new GNode<>(4);
        GNode<Integer> n5=new GNode<>(5);
        n1.list.add(n2);
        n1.list.add(n3);
        n2.list.add(n4);
        n3.list.add(n5);
        obj.printLevelWise(n1);
    }
    
}
