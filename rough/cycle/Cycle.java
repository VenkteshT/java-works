package rough.cycle;

import rough.vehicle.Vehicle;

public abstract class Cycle extends Vehicle{
    private int speed;
    private String color;
    public Cycle(int wheels,int speed)
    {
        super (wheels);
        this.speed=speed;
    }
    public int getTopSpeed()
    {
        return this.speed;
    }
    public void setColor(String clr)
    {
        this.color=clr;
    }
    public boolean isVehicle()
    {
        return false;
    }
}
