/**
 * This is the GUI For vehicle class autoRickshaw and Electric Scooter
 * Instance variables are declared
 * Many Buttons are used
 * @author (Anup Acharya Chhetri)
 * @version (2022-05-08)
 */
// Importing Java Function from Library
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;

public class TransportGUI implements ActionListener
{
    //Declaring an instance Variable
    private JFrame frm,frm2,frm3;
    private JPanel pnl,pnl2,pnl3;
    private JLabel label0 , label00, label1, label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,
    label16, label17,labl0,labl00 ,labl1,labl2,labl3,labl4,labl5,labl6,labl7,labl8,labl9,labl10,labl11,labl12,labl13,labl14,labl15,labl16,labl17,label18,
    labelmenu1;
    private JTextField fld1,fld2,fld3,fld4,fld5,fld6,fld7,fld8,fld9,fld10,fld11,fld12,fld13,fld14,fld15,fld16,fld17,fild1,fild2,fild3,fild4,fild5,
    fild6,fild7,fild8,fild9,fild10,fild11,fild12,fild13,fild14,fild15,fild16,fild17;
    private JButton button_1,button_2,button_3,button_4,button_5,btn_1,btn_2,btn_3,btn_4,btn_5, btn_6,menuButton1,menuButton2;
    private JComboBox year, month, date;
    private ElectricScooter erObj2;
    ArrayList<Vehicle> val = new ArrayList<Vehicle>();
    // Creating menu method
    public void menu(){
        frm3 = new JFrame();// Creating frame
        frm3.setBounds(00,200,700,440);
        frm3.setTitle("Menu");
        frm3.setLayout(null);
        Color cc = new Color(227, 227,227);
        frm3.setBackground(cc);

        pnl3 = new JPanel();// Creating panel
        pnl3.setBounds(0,0,700,440);
        Font fg = new Font("Arial",Font.BOLD,40);
        Color ce = new Color(134, 232, 107);
        Color cd = new Color(189,189,189);
        Font xx = new Font("Arial",Font.ITALIC,25);
        pnl3.setBackground(cc);
        pnl3.setLayout(null);

        labelmenu1 = new JLabel();// Creating Jlabel
        labelmenu1.setBounds(180,30,470,30);
        labelmenu1.setFont(fg);
        labelmenu1.setText("Select Your Vehicle");
        pnl3.add(labelmenu1);

        menuButton1 = new JButton();// Creating JBUTTON
        menuButton1.setBounds(210,100,235,150);
        menuButton1.setText("AutoRickshaw");
        menuButton1.addActionListener(this);
        menuButton1.setFocusable(false);
        menuButton1.setFont(xx);
        menuButton1.setBackground(cd);
        pnl3.add(menuButton1);

        menuButton2 = new JButton();
        menuButton2.setBounds(250,100,235,150);
        menuButton2.setText("ElectricScooter");
        menuButton2.addActionListener(this);
        menuButton2.setFocusable(false);
        menuButton2.setFont(xx);
        menuButton2.setBackground(ce);
        pnl3.add(menuButton2);

        frm3.add(pnl3);
        frm3.setVisible(true);
        frm3.setResizable(false);

    }
    // Creating auto method
    public void auto(){   
        //Creating a Jframe
        frm = new JFrame();
        frm.setBounds(100,100,860,610);
        frm.setTitle("Auto Rickshaw");
        frm.setLayout(null);

        //Creating a panel
        pnl = new JPanel();
        pnl.setBounds(10,10,840,590);
        Font ff =  new Font("Arial",Font.BOLD,20);
        Font gg =  new Font("Arial",Font.BOLD,40);
        Color cc = new Color(247, 236, 247);
        pnl.setBackground(cc);
        pnl.setLayout(null);
        //creating jlabel
        label0 = new JLabel();
        label0.setText(" Vehicle GUI");
        label0.setFont(gg);
        label0.setBounds(220,10,400,40);
        pnl.add(label0);

        label00 = new JLabel();
        label00.setText("Auto Rickshaw");
        label00.setFont(gg);
        label00.setBounds(220,60,400,40);
        pnl.add(label00);

        label1 = new JLabel();
        label1.setText("Vehicle Name:");
        label1.setFont(ff);
        label1.setBounds(10,150,225,25);
        pnl.add(label1);

        label2 = new JLabel();
        label2.setText("Vehicle ID:");
        label2.setFont(ff);
        label2.setBounds(10,180,225,25);
        pnl.add(label2);

        label3 = new JLabel();
        label3.setText("Vehicle Weight:");
        label3.setFont(ff);
        label3.setBounds(10,210,225,25);
        pnl.add(label3);

        label4 = new JLabel();
        label4.setText("Vehicle Color:");
        label4.setFont(ff);
        label4.setBounds(350,150,325,25);
        pnl.add(label4);

        label5 = new JLabel();
        label5.setText("Speed:");
        label5.setFont(ff);
        label5.setBounds(350,180,325,25);
        pnl.add(label5);

        label6 = new JLabel();
        label6.setText("Engine Displacement:");
        label6.setFont(ff);
        label6.setBounds(350,210,325,25);
        pnl.add(label6);

        label7 = new JLabel();
        label7.setText("Fuel Tank Capacity:");
        label7.setFont(ff);
        label7.setBounds(350,240,325,25);
        pnl.add(label7);

        label8 = new JLabel();
        label8.setText("Torque:");
        label8.setFont(ff);
        label8.setBounds(10,240,225,25);
        pnl.add(label8);

        label9 = new JLabel();
        label9.setText("No Of Seats:");
        label9.setFont(ff);
        label9.setBounds(10,270,225,25);
        pnl.add(label9);

        label10 = new JLabel();
        label10.setText("Ground Clearance:");
        label10.setFont(ff);
        label10.setBounds(10,300,225,25);
        pnl.add(label10);

        label11 = new JLabel();
        label11.setText("Charge Amount:");
        label11.setFont(ff);
        label11.setBounds(10,330,225,25);
        pnl.add(label11);

        label12 = new JLabel();
        label12.setText("Range:");
        label12.setFont(ff);
        label12.setBounds(10,360,225,25);
        pnl.add(label12);

        label13 = new JLabel();
        label13.setText("Battery Capacity:");
        label13.setFont(ff);
        label13.setBounds(10,390,225,25);
        pnl.add(label13);

        label14 = new JLabel();
        label14.setText("Price:");
        label14.setFont(ff);
        label14.setBounds(10,420,225,25);
        pnl.add(label14);

        label15 = new JLabel();
        label15.setText("Brand:");
        label15.setFont(ff);
        label15.setBounds(350,270,325,25);
        pnl.add(label15);

        label16 = new JLabel();
        label16.setText("Charging Time:");
        label16.setFont(ff);
        label16.setBounds(350,300,325,25);
        pnl.add(label16);

        label17 = new JLabel();
        label17.setText("Mileage:");
        label17.setFont(ff);
        label17.setBounds(350,330,325,25);
        pnl.add(label17);

        label18 = new JLabel();
        label18.setText("Booked date");
        label18.setBounds(350, 360, 325, 25);
        label18.setFont(ff);
        pnl.add(label18);

        //Creating a JtextField
        fld1 = new JTextField();
        fld1.setBounds(190,150,150,25);
        pnl.add(fld1);

        fld2 = new JTextField();
        fld2.setBounds(190,180,150,25);
        pnl.add(fld2);

        fld3 = new JTextField();
        fld3.setBounds(190,210,150,25);
        pnl.add(fld3);

        fld4 = new JTextField();
        fld4.setBounds(560,150,225,25);
        pnl.add(fld4);

        fld5 = new JTextField();
        fld5.setBounds(560,180,225,25);
        pnl.add(fld5);

        fld6 = new JTextField();
        fld6.setBounds(560,210,225,25);
        pnl.add(fld6);

        fld7 = new JTextField();
        fld7.setBounds(560,240,225,25);
        pnl.add(fld7);

        fld8 = new JTextField();
        fld8.setBounds(190,240,150,25);
        pnl.add(fld8);

        fld9 = new JTextField();
        fld9.setBounds(190,270,150,25);
        pnl.add(fld9);

        fld10 = new JTextField();
        fld10.setBounds(190,300,150,25);
        pnl.add(fld10);

        fld11 = new JTextField();
        fld11.setBounds(190,330,150,25);
        pnl.add(fld11);

        fld12 = new JTextField();
        fld12.setBounds(190,360,150,25);
        pnl.add(fld12);

        fld13 = new JTextField();
        fld13.setBounds(190,390,150,25);
        pnl.add(fld13);

        fld14 = new JTextField();
        fld14.setBounds(190,420,150,25);
        pnl.add(fld14);

        fld15 = new JTextField();
        fld15.setBounds(560,270,225,25);
        pnl.add(fld15);

        fld16 = new JTextField();
        fld16.setBounds(560,300,225,25);
        pnl.add(fld16);

        fld17 = new JTextField();
        fld17.setBounds(560,330,225,25);
        pnl.add(fld17);

        String[] yars = {"1995" , "1996" , "1997" , "1998" , "1999" ,"2000" , "2001" , "2002" , "2003" , "2004" , "2005" , "2006" , "2007" , "2008"
            , "2009" , "2010" , "2011" , "2012" , "2013" , "2014" , "2015" , "2016" , "2017" , "2018" , "2019" , "2020" , "2021" , "2022"};
        year = new JComboBox(yars);
        year.setBounds(560, 360, 60, 40);
        pnl.add(year);

        String[] months = {"January" , "Feburary" , "March" , "April" , "May" ,"June" , "July" , "August" , "September" , "October" , "November" ,
                "December"};
        month = new JComboBox(months);
        month.setBounds(630, 360, 90, 40);
        pnl.add(month);

        String[] dates = {"1" , "2" , "3" , "4" , "5" ,"6" , "7" , "8" , "9" , "10" , "11" , "12" , "13" , "14" , "15" , "16" , "17" , "18" , "19" 
            , "20", "21" , "22" , "23" , "24" , "25" , "26" , "27" , "28" , "29" , "30"};
        date = new JComboBox(dates);
        date.setBounds(730, 360, 40, 40);
        pnl.add(date);

        button_1 = new JButton();
        button_1.setText("Add");
        button_1.setBounds(30, 470, 150, 50);
        button_1.addActionListener(this);
        button_1.setFocusable(false);
        pnl.add(button_1);

        button_2 = new JButton();
        button_2.setText("Book");
        button_2.setBounds(200, 470, 150, 50);
        button_2.addActionListener(this);
        button_2.setFocusable(false);
        pnl.add(button_2);

        button_3 = new JButton();
        button_3.setText("Display");
        button_3.setBounds(370, 470, 150, 50);
        button_3.addActionListener(this);
        button_3.setFocusable(false);
        pnl.add(button_3);

        button_4 = new JButton();
        button_4.setText("Clear");
        button_4.setBounds(550, 470, 150, 50);
        button_4.addActionListener(this);
        pnl.add(button_4);
        button_4.setFocusable(false);

        button_5 = new JButton();
        button_5.setText("Menu");
        button_5.setBounds(730, 470, 100, 50);
        button_5.addActionListener(this);
        button_5.setFocusable(false);
        pnl.add(button_5);

        frm.add(pnl);
        frm.setVisible(true);
        frm.setResizable(false);

    }
    //Action performed of auto rickshaw
    public void actionPerformed(ActionEvent e){
        // Initializing TextFields
        if(e.getSource() == button_1)
        {
            try{

                String name = fld1.getText();//Initializing TextField

                String id = fld2.getText();
                int fld_2 = Integer.parseInt(id);//Initializing TextField

                String weight = fld3.getText();//Initializing TextField

                String color= fld4.getText();//Initializing TextField

                String speed = fld5.getText();//Initializing TextField

                String engineDisplacement = fld6.getText();//Initializing TextField
                int fld_6 = Integer.parseInt(engineDisplacement);

                String fuelTankCapacity = fld7.getText();//Initializing TextField
                int fld_7 = Integer.parseInt(fuelTankCapacity);

                String Torque = fld8.getText();//Initializing TextField

                String groundClearance= fld10.getText();//Initializing TextField

                //  creating object 
                AutoRickshaw arobj = new AutoRickshaw(fld_2,name,weight,color,speed,fld_6,Torque,fld_7,groundClearance);
                val.add(arobj);
                JOptionPane.showMessageDialog(pnl, "Message filled");//displaying output throug message dialog box
            }// Using try catch for exception
            catch(NumberFormatException exc){

                JOptionPane.showMessageDialog(pnl, "Please Fill the Data");//displaying output throug message dialog box

            }
        }
        if(e.getSource() == btn_1)
        {
            try{

                String id = fild2.getText();
                int vId = Integer.parseInt(id);

                String name = fild1.getText();

                String weight = fild3.getText();

                String color = fild4.getText();

                String speed = fild5.getText();

                String BatteryCapacity = fild13.getText();
                int batterycap = Integer.parseInt(id);

                ElectricScooter erobj = new ElectricScooter(vId,name,weight,color,speed,batterycap);
                val.add(erobj);
                JOptionPane.showMessageDialog(pnl2, "Message  was filled");//displaying output throug message dialog box
            }
            catch(NumberFormatException exc){

                JOptionPane.showMessageDialog(pnl2, "Please Fill the Data");//displaying output throug message dialog box
            }
        }

        if(e.getSource() == menuButton1)
        {   
            frm3.dispose();// Disposing frame to open new method
            auto();
        }

        if(e.getSource() == menuButton2)
        {
            frm3.dispose();// Disposing frame to open new method
            electric();

        }
        if(e.getSource() == button_5)
        {
            frm.dispose();// Disposing frame to open new method
            menu();

        }
        if(e.getSource() == btn_5)
        {
            frm2.dispose();// Disposing frame to open new method
            menu();

        }
        if(e.getSource() == button_2)
        {
            try {
                String id = fld2.getText();
                int vId = Integer.parseInt(id);

                String numberOfSeats = fld9.getText();
                int nos = Integer.parseInt(numberOfSeats);

                String chargeamt = fld11.getText();
                int camt = Integer.parseInt(chargeamt);

                String y = year.getSelectedItem().toString();
                String m = month.getSelectedItem().toString();
                String d = date.getSelectedItem().toString();

                String ydm = (y+ "/" + d + "/"+ m);

                for (Vehicle obj1 : val)
                {
                    if(obj1 instanceof AutoRickshaw){
                        // DownCasting
                        AutoRickshaw autoobj1 = (AutoRickshaw) obj1;
                        // Comparing the data of vehcile id
                        if(autoobj1.getvehicleId() == vId){
                            if(autoobj1.getisBooked() == true){//displaying output throug message dialog box
                                JOptionPane.showMessageDialog(frm, "Already Booked","Error",JOptionPane.WARNING_MESSAGE);

                            }
                            else if(autoobj1.getisBooked() == false){
                                autoobj1.book(ydm,camt,nos);
                                JOptionPane.showMessageDialog(frm, "auto rickshaw has been booked");//displaying output throug message dialog box

                            }

                        }
                    }

                }
            }
            catch(NumberFormatException excep){
                JOptionPane.showMessageDialog(frm, "Please fill all fields.");//displaying output throug message dialog box

            }

        }
        if(e.getSource() == button_3){
            for(Vehicle obj1 : val){
                //Downcasting
                if (obj1 instanceof AutoRickshaw){
                    AutoRickshaw dobj1 = (AutoRickshaw)obj1;
                    dobj1.display();
                }
            }
        }

        if(e.getSource() == btn_2){
            try{
                int vId = Integer.parseInt(fild2.getText());
                String brand = fild5.getText();
                int price = Integer.parseInt(fild14.getText());
                String charging_time = fild16.getText();
                String mileage = fild17.getText();
                int range = Integer.parseInt(fild12.getText());
                for (Vehicle obj2: val){

                    if (obj2 instanceof ElectricScooter){
                        erObj2 = (ElectricScooter)obj2;//downcasting 

                        if(erObj2.getvehicleId() == vId){// Comparing vID
                            if (erObj2.gethasPurchased() == true) {
                                JOptionPane.showMessageDialog(frm2 ,"Electric scooter has Already been purchased");
                                break;

                            }else{ //displaying output throug message dialog box
                                JOptionPane.showMessageDialog(frm2 ,"Electric scooter has been successfuly purchased !");
                                erObj2.purchase(brand, price,charging_time, mileage, range);
                            }
                        }
                    }

                }
            }catch(NumberFormatException excep){
                JOptionPane.showMessageDialog(frm2 ,"Error occured! \n Enter correct values"); 
            }
        }

        if(e.getSource() == btn_3){
            for(Vehicle obj2 : val){
                if (obj2 instanceof ElectricScooter){
                    ElectricScooter eObj2  = (ElectricScooter)obj2;
                    eObj2.display();
                }
            }
        }

        if (e.getSource() == button_4) {
            fld1.setText("");
            fld2.setText("");
            fld3.setText("");
            fld4.setText("");
            fld5.setText("");
            fld6.setText("");
            fld7.setText("");
            fld8.setText("");
            fld9.setText("");
            fld10.setText("");
            fld11.setText("");
            fld12.setText("");
            fld13.setText("");
            fld14.setText("");
            fld15.setText("");
            fld16.setText("");
            fld17.setText("");

        } 
        if (e.getSource() == btn_4) {
            fild1.setText("");
            fild2.setText("");
            fild3.setText("");
            fild4.setText("");
            fild5.setText("");
            fild6.setText("");
            fild7.setText("");
            fild8.setText("");
            fild9.setText("");
            fild10.setText("");
            fild11.setText("");
            fild12.setText("");
            fild13.setText("");
            fild14.setText("");
            fild15.setText("");
            fild16.setText("");
            fild17.setText("");

        }

        if(e.getSource() == btn_6){

            //To catch the number format exception
            try{

                int vehicleID_sell = Integer.valueOf(fild2.getText());
                int price_sell = Integer.valueOf(fild14.getText());

                //Checking every instance in ArrayList
                for(Vehicle k : val){

                    //checking if erobj2 instance of ELectric scooter or not
                    if(k instanceof ElectricScooter)
                    {

                        //downcasting 
                        erObj2 = (ElectricScooter) k;

                        //checking the vehicle id in textfield is present in array list 
                        if(erObj2.getvehicleId() == vehicleID_sell){

                            //checking the condition for has sold
                            if(erObj2.gethasSold() == true){

                                //displaying output throug message dialog box
                                JOptionPane.showMessageDialog(frm2, "The vehicle has been alrady sold.","Error`",JOptionPane.WARNING_MESSAGE);

                            }
                            else if(erObj2.gethasSold() == false){

                                //Displaying output through message dialog box
                                erObj2.sell(price_sell);
                                JOptionPane.showMessageDialog(frm2, "The vehicle ID "+ vehicleID_sell + "of price " + price_sell + "has been succefully sold." );

                            }
                        }else{
                            JOptionPane.showMessageDialog(frm2, "Does not Exist","Error",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
            catch(NumberFormatException except)
            {

                //Displaying output through message dialog box
                JOptionPane.showMessageDialog(frm2, "Please fill all the fields.");
            }
        }

    }

    public void electric()
    {
        //Creating a Jframe
        frm2 = new JFrame();
        frm2.setBounds(100,100,860,610);
        frm2.setTitle("Electric scooter");
        frm2.setLayout(null);

        //Creating a panel
        pnl2 = new JPanel();
        pnl2.setBounds(10,10,840,590);
        Font ff =  new Font("Arial",Font.BOLD,20);
        Font gg =  new Font("Arial",Font.BOLD,40);
        Color cc = new Color(247, 236, 247);
        pnl2.setBackground(cc);
        pnl2.setLayout(null);

        labl0 = new JLabel();
        labl0.setText(" Vehicle GUI");
        labl0.setFont(gg);
        labl0.setBounds(220,10,400,40);
        pnl2.add(labl0);

        labl00 = new JLabel();
        labl00.setText("Electric Scooter");
        labl00.setFont(gg);
        labl00.setBounds(220,60,400,40);
        pnl2.add(labl00);

        labl1 = new JLabel();
        labl1.setText("Vehicle Name:");
        labl1.setFont(ff);
        labl1.setBounds(10,150,225,25);
        pnl2.add(labl1);

        labl2 = new JLabel();
        labl2.setText("Vehicle ID:");
        labl2.setFont(ff);
        labl2.setBounds(10,180,225,25);
        pnl2.add(labl2);

        labl3 = new JLabel();
        labl3.setText("Vehicle Weight:");
        labl3.setFont(ff);
        labl3.setBounds(10,210,225,25);
        pnl2.add(labl3);

        labl4 = new JLabel();
        labl4.setText("Vehicle Color:");
        labl4.setFont(ff);
        labl4.setBounds(350,150,325,25);
        pnl2.add(labl4);

        labl5 = new JLabel();
        labl5.setText("Speed:");
        labl5.setFont(ff);
        labl5.setBounds(350,180,325,25);
        pnl2.add(labl5);

        labl6 = new JLabel();
        labl6.setText("Engine Displacement:");
        labl6.setFont(ff);
        labl6.setBounds(350,210,325,25);
        pnl2.add(labl6);

        labl7 = new JLabel();
        labl7.setText("Fuel Tank Capacity:");
        labl7.setFont(ff);
        labl7.setBounds(350,240,325,25);
        pnl2.add(labl7);

        labl8 = new JLabel();
        labl8.setText("Torque:");
        labl8.setFont(ff);
        labl8.setBounds(10,240,225,25);
        pnl2.add(labl8);

        labl9 = new JLabel();
        labl9.setText("No Of Seats:");
        labl9.setFont(ff);
        labl9.setBounds(10,270,225,25);
        pnl2.add(labl9);

        labl10 = new JLabel();
        labl10.setText("Ground Clearance:");
        labl10.setFont(ff);
        labl10.setBounds(10,300,225,25);
        pnl2.add(labl10);

        labl11 = new JLabel();
        labl11.setText("Charge Amount:");
        labl11.setFont(ff);
        labl11.setBounds(10,330,225,25);
        pnl2.add(labl11);

        labl12 = new JLabel();
        labl12.setText("Range:");
        labl12.setFont(ff);
        labl12.setBounds(10,360,225,25);
        pnl2.add(labl12);

        labl13 = new JLabel();
        labl13.setText("Battery Capacity:");
        labl13.setFont(ff);
        labl13.setBounds(10,390,225,25);
        pnl2.add(labl13);

        labl14 = new JLabel();
        labl14.setText("Price:");
        labl14.setFont(ff);
        labl14.setBounds(10,420,225,25);
        pnl2.add(labl14);

        labl15 = new JLabel();
        labl15.setText("Brand:");
        labl15.setFont(ff);
        labl15.setBounds(350,270,325,25);
        pnl2.add(labl15);

        labl16 = new JLabel();
        labl16.setText("Charging Time:");
        labl16.setFont(ff);
        labl16.setBounds(350,300,325,25);
        pnl2.add(labl16);

        labl17 = new JLabel();
        labl17.setText("Mileage:");
        labl17.setFont(ff);
        labl17.setBounds(350,330,325,25);
        pnl2.add(labl17);

        //Creating a JtextField
        fild1 = new JTextField();
        fild1.setBounds(190,150,150,25);
        pnl2.add(fild1);

        fild2 = new JTextField();
        fild2.setBounds(190,180,150,25);
        pnl2.add(fild2);

        fild3 = new JTextField();
        fild3.setBounds(190,210,150,25);
        pnl2.add(fild3);

        fild4 = new JTextField();
        fild4.setBounds(560,150,225,25);
        pnl2.add(fild4);

        fild5 = new JTextField();
        fild5.setBounds(560,180,225,25);
        pnl2.add(fild5);

        fild6 = new JTextField();
        fild6.setBounds(560,210,225,25);
        pnl2.add(fild6);

        fild7 = new JTextField();
        fild7.setBounds(560,240,225,25);
        pnl2.add(fild7);

        fild8 = new JTextField();
        fild8.setBounds(190,240,150,25);
        pnl2.add(fild8);

        fild9 = new JTextField();
        fild9.setBounds(190,270,150,25);
        pnl2.add(fild9);

        fild10 = new JTextField();
        fild10.setBounds(190,300,150,25);
        pnl2.add(fild10);

        fild11 = new JTextField();
        fild11.setBounds(190,330,150,25);
        pnl2.add(fild11);

        fild12 = new JTextField();
        fild12.setBounds(190,360,150,25);
        pnl2.add(fild12);

        fild13 = new JTextField();
        fild13.setBounds(190,390,150,25);
        pnl2.add(fild13);

        fild14 = new JTextField();
        fild14.setBounds(190,420,150,25);
        pnl2.add(fild14);

        fild15 = new JTextField();
        fild15.setBounds(560,270,225,25);
        pnl2.add(fild15);

        fild16 = new JTextField();
        fild16.setBounds(560,300,225,25);
        pnl2.add(fild16);

        fild17 = new JTextField();
        fild17.setBounds(560,330,225,25);
        pnl2.add(fild17);

        btn_1 = new JButton();
        btn_1.setText("Add");
        btn_1.setBounds(30, 470, 150, 50);
        btn_1.addActionListener(this);
        btn_1.setFocusable(false);
        pnl2.add(btn_1);

        btn_2 = new JButton();
        btn_2.setText("Purchase");
        btn_2.setBounds(200, 470, 150, 50);
        btn_2.addActionListener(this);
        btn_2.setFocusable(false);
        pnl2.add(btn_2);

        btn_3 = new JButton();
        btn_3.setText("Display");
        btn_3.setBounds(370, 470, 150, 50);
        btn_3.addActionListener(this);
        btn_3.setFocusable(false);
        pnl2.add(btn_3);

        btn_4 = new JButton();
        btn_4.setText("Clear");
        btn_4.setBounds(550, 470, 150, 50);
        btn_4.addActionListener(this);
        btn_4.setFocusable(false);
        pnl2.add(btn_4);

        btn_5 = new JButton();
        btn_5.setText("Menu");
        btn_5.setBounds(730, 470, 100, 50);
        btn_5.addActionListener(this);
        btn_5.setFocusable(false);
        pnl2.add(btn_5);

        btn_6 = new JButton();
        btn_6.setText("Sell Electric Scooter");
        btn_6.setBounds(370, 370, 400, 50);
        btn_6.addActionListener(this);
        btn_6.setFocusable(false);
        pnl2.add(btn_6);

        frm2.add(pnl2);
        frm2.setVisible(true);
        frm2.setResizable(false);
    } 

    public static void main(String[] args){
        TransportGUI obj = new TransportGUI();
        obj.menu();

    }
}       

