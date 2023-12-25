package rough.car;

import rough.vehicle.Vehicle;

public abstract class Car extends Vehicle {
    
    private int speed;
    public Car(int wheel,int speed)
    {
        super(wheel);
        this.speed=speed;
    }
    public int getTopSpeed()
    {
        return this.speed;
    }
    public boolean isVehicle()
    {
        return true;
    }
}
