package dsa.BST;

public class useBst {
    public static void main(String[] args) {
        BST b=new BST();
        b.insert(0);
        b.insert(4);
        b.insert(2);
        b.insert(1);
        b.insert(3);
        b.insert(6);
        b.insert(5);
        b.insert(7);
        b.delete(4);
        b.print();
        System.out.println("ans:"+b.min());
       
    }
}
