package rough.car;

public class BMW extends Car {
    public BMW(int wheel,int speed)
    {
        super(wheel, speed);
    }
    public String getCompany()
    {
        return "BMW";
    }
    public static void main(String[] args) {
        BMW b=new BMW(4, 300);
        b.setColor("yellow");
        System.out.println(b.getColor());
    }
}
 