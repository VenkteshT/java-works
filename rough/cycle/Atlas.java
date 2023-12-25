package rough.cycle;

public class Atlas extends Cycle {
    public Atlas(int wheel,int speed)
    {
        super(wheel, speed);
    }
    public String getCompany()
    {
        return "Atlas";
    }
    public static void main(String[] args) {
        Atlas a=new Atlas(2, 40);
        System.out.println(a.getTopSpeed());
    }
}
