package rough.vehicle;

public abstract class Vehicle {
    private int wheels;
    private String color;

    public Vehicle(int wheels)
    {
        this.wheels=wheels;
        System.out.println("from vehichle constuctor");
    }

    public void setColor(String clr)
    {
        this.color=clr;
    }

    public int getWheels()
    {
        return this.wheels;
    }
    public String getColor()
    {
        return this.color;
    }
    public abstract boolean isVehicle();
    public abstract String getCompany();
}
