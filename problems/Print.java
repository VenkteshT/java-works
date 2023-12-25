package problems;
public class Print {
    public static void main(String[] args) 
    {
        DynamicArray a1=new DynamicArray();

        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        a1.add(6);
        a1.add(11);
        a1.add(12);
        a1.add(13);
        a1.add(14);
        a1.add(15);
        a1.add(16);
        a1.add(17);
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        a1.add(6);
        a1.add(11);

        a1.set(a1.size()-1, a1.size());
        a1.printArray();
        System.out.println(a1.currentIndex());
    }    
}
