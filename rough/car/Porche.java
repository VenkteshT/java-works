package rough.car;

public class Porche extends Car {

    public Porche(int wheel,int speed)
    {
        super(wheel,speed);
    }
    public String getCompany()
    {
        return "PORCHE";
    }
     public static void main(String[] args) {
        Porche p=new Porche(4, 333);
        p.setColor("red-black");
        System.out.println("color: "+p.getColor()+" speed: "+p.getTopSpeed());  
        System.out.println(p.isVehicle());
        System.out.println(p.getCompany());  
    }
}
