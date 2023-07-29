/**
 * This is a vehicle class which have few attributes as int vehiclId, String vehicleName, String vehicleWeight, String vehicleColor, int vehicleSpeed 
 * The Vehicle id, Vehicle name, Vehicle Color and Vehicle weight are initialized in the constructor by being assigned the value of the constructor's parameters.
 * There are two methods getter and setter.
 * Values are dispalyed by display method.
 * @author (Anup Acharya Chhetri)
 * @version/date(2022-05-17)
 */
public class Vehicle {
    // declaring attributes for vehicle class
    private int vehicleId;
    private String vehicleName;
    private String vehicleWeight;
    private String vehicleColor;
    private String vehicleSpeed;

    //creating a constructor
    public Vehicle(int vehicleId, String vehicleName, String vehicleColor, String vehicleWeight) 
    {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.vehicleColor = vehicleColor;
        this.vehicleWeight = vehicleWeight;
    }

    // this is accessor method  for vehicleId
    public int getvehicleId() 
    {
        return this.vehicleId;
    }

    // this is accessor method  for vehicleName
    public String getvehicleName()
    {
        return this.vehicleName;
    }
    
    // this is accessor method  for vehicleColor
    public String getColor() 
    {
        return this.vehicleColor;
    }

    // this is accessor method  for vehicleWeight
    public String getvehicleWeight()
    {
        return this.vehicleWeight;
    }

    
    // this is setter method  for vehicleSpeed
    public void setvehicleSpeed(String vehicleSpeed) 
    {
        this.vehicleSpeed = vehicleSpeed;
    }

    // this is setter method  for vehicleColor
    public void setvehicleColor(String VehicleColor)
    {
        this.vehicleColor = vehicleColor;
    }

    // this is diplay method to display information
    public void display() 
    {
        System.out.println("the vehicle name is " + this.vehicleName);
        System.out.println("the vehicle color is " + this.vehicleColor);
        System.out.println("the vehicle speed is " + this.vehicleSpeed);
        System.out.println("the vehicle Id is " + this.vehicleId);
        if (vehicleWeight == "") {
            System.out.println("Vehicle weight is empty");
        } 
        else {
            System.out.println("vehicle weight is" + this.vehicleWeight);
        }
    }
}