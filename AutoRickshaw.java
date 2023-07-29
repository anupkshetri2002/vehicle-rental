/**
 * The constructor accepts nine parameters, which are the Vehicle ID, Vehiclename, Vehicle Weight, Vehicle Color, Vehicle speed, engine displacement,
   torque, fuel tank capacity and ground clearance.
 * There are two methods getter and setter.
 * Values are dispalyed by display method.
 * @author (Anup Acharya Chhetri)
 * @version (2022-05-18)
 */
// declaring attributes
public class AutoRickshaw extends Vehicle {
    private int EngineDisplacement;
    private String Torque;
    private int NumberOfSeats;
    private int FuelTankCapacity;
    private String GroundClearance;
    private int ChargeAmount;
    private String BookedDate;
    private boolean isBooked;
    // creating constructor
    public AutoRickshaw(int vehicleId, String vehicleName,
        String vehicleWeight, String vehicleColor, String vehicleSpeed,
        int EngineDisplacement, String Torque,
        int FuelTankCapacity, String GroundClearance) {
        super(vehicleId, vehicleName, vehicleColor, vehicleWeight);
        super.setvehicleSpeed(vehicleSpeed);
        super.setvehicleColor(vehicleColor);
        this.EngineDisplacement = EngineDisplacement;
        this.Torque = Torque;
        this.FuelTankCapacity = FuelTankCapacity;
        this.ChargeAmount = ChargeAmount;
        this.NumberOfSeats = NumberOfSeats;
        this.GroundClearance = GroundClearance;
        this.isBooked = false;
    }
    // this is accessor method for auto rickshaw
    public int getEngineDisplacement() 
    {
        return this.EngineDisplacement;
    }
    public String getTorque() 
    {
        return this.Torque;
    }
    public int getNumberOfSeats() 
    {
        return this.NumberOfSeats;
    }
    public int getFuelTankCapacity() 
    {
        return this.FuelTankCapacity;
    }
    public String getGroundClearance() 
    {
        return this.GroundClearance;
    }
    public int getChargeAmount() 
    {
        return this.ChargeAmount;
    }
    public String getBookedDate() 
    {
        return this.BookedDate;
    }
    public boolean getisBooked() 
    {
        return this.isBooked;
    }
    //this is setter method  for auto rickshaw chargeAmount
    public void setChargeAmount(int newChargeAmount) 
    {
        this.ChargeAmount = newChargeAmount;
    }
    //this is setter method for autorickshaw number of seats
    public void setNumberOfSeats(int newNumberOfSeats)
    {
        this.NumberOfSeats = newNumberOfSeats;
    }
    public void book(String BookedDate, int chargeAmount, int NumberOfSeats) {
        if (isBooked == false) {
            this.BookedDate = BookedDate;
            this.ChargeAmount = ChargeAmount;
            this.NumberOfSeats = NumberOfSeats;
            this.isBooked = true;
            System.out.println(getvehicleName() + " has been booked ");
        } else {
            System.out.println("is booked =" + isBooked);
            System.out.println("has been booked already");
        }
    }
    // this is display method
    public void display() {
        super.display();
        if (this.isBooked == true) {
            System.out.println("engine displacement " + this.EngineDisplacement);
            System.out.println("torque " + this.Torque);
            System.out.println("fuel tank capacity " + this.FuelTankCapacity);
            System.out.println("ground clearance " + this.GroundClearance);
            System.out.println("Booked date " + this.BookedDate);
        }
        
        if (this.ChargeAmount == 0)
        {
            System.out.println("notset");
        } else 
        {
            System.out.println("Charged Amount " + this.ChargeAmount);
        }
        
        if (this.NumberOfSeats == 0) 
        {
            System.out.println("notset");
        } else 
        {
            System.out.println("NumberofSeats " + NumberOfSeats);
        }
    }
}