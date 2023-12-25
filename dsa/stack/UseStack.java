package dsa.stack;

public class UseStack {
    public static void main(String[] args) {
        CustomStack s=new CustomStack(5);
        s.add(5);
        s.add(4);
        s.add(3);
        s.add(2);
        s.add(1);
        s.pop();
        System.out.println(s.top());
        System.out.println(s.top());
        System.out.println(s.top());
        System.out.println(s.top());
    }
}
