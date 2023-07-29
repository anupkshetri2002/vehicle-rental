/**
 * This class is called ElectricScooter which inherits attribues and methods from the superclass Vehicle.
 * It introduces  attributes as Range int, 
 * Battery Capacity int, Price int, Charging Time String, Brand String, Mileage String, hasPurchased boolean, hasSold boolean. 
 * Values are dispalyed by display method.
 * Values are dispalyed by display method.
 * @author (Anup Acharya Chhetri)
 * @version (2002-05-19)
 */
 public class ElectricScooter extends Vehicle {
    private int Range;
    private int BatteryCapacity;
    private int Price;
    private String ChargingTime;
    private String Mileage;
    private String Brand;
    private boolean hasPurchased;
    private boolean hasSold;
    //creating constructor
    public ElectricScooter( int vehicleId, String vehicleName, String vehicleWeight,
        String vehicleColor, String vehicleSpeed, int BatteryCapacity) {
        super(vehicleId, vehicleName,vehicleWeight,vehicleColor); //calling constructor
        super.setvehicleSpeed(vehicleSpeed);
        super.setvehicleColor(vehicleColor);
        this.BatteryCapacity = BatteryCapacity;
        this.Range = 0;
        this.Price = 0;
        this.Brand = "";
        this.Mileage = "";
        this.ChargingTime = "";
        this.hasPurchased = false;
        this.hasSold = false;
    }
    //this is accessor method for range
    public int getRange() 
    {
        return this.Range;
    }
    //this is accessor method for battery capacity
    public int getBatteryCapacity() 
    {
        return this.BatteryCapacity;
    }
    //this is accessor method for price
    public int getPrice()
    {
        return this.Price;
    }
    //this is accessor method for time
    public String getChargingTime() 
    {
        return this.ChargingTime;
    }
    //this is accessor method for brand
    public String getBrand() 
    {
        return this.Brand;
    }
    //this is accessor method for mileage
    public String getMileage()
    {
        return this.Mileage;
    }
    //this is accessor method for purchase
    public boolean gethasPurchased() 
    {
        return this.hasPurchased;
    }
    //this is accessor method for sold
    public boolean gethasSold()
    {
        return this.hasSold;
    }

    //setter method for electricscooter
    public void setBrand(String Brand)
    {
        if (hasPurchased == false) 
        {
            this.Brand = Brand;
        } else 
        {
            System.out.println("The scooter is already purchased, so it's not possible to change the brand ");
        }
    }
    public void purchase(String Brand,int Price, String ChargingTime, String Mileage, int Range) {
        if (hasPurchased == false){
            this.setBrand(Brand);
            this.Price = Price;
            this.ChargingTime = ChargingTime;
            this.Mileage = Mileage;
            this.Range = Range;
            this.hasPurchased = true;
        }
    
    }

    //method to sell scooter
    public void sell(int price) {

        if (hasSold ==false) {
            this.Price = Price;
            this.Mileage = "";
            this.ChargingTime = "";
            this.BatteryCapacity = 0;
            this.Range = 0;
            this.hasSold = true;
            this.hasPurchased = false;

        } else 
        {
            System.out.println("The Scooteris already sold.");
        }
    }
    // this is display method
    public void display() 
    {
        super.display();

        if (this.hasPurchased = true) {
            System.out.println("The brand of the electric scooter is " + this.Brand);
            System.out.println("The battery capacity of the electric scooter is " + this.BatteryCapacity);
            System.out.println("The mileage of the electri scooter is " + this.Mileage);
            System.out.println("The range of the electric scooter is " + this.Range);
            System.out.println("The recharge time of the electric scooter is " + this.ChargingTime);
        }
    }
}