package com.kwdevelopmentllc.finalproject;

import androidx.appcompat.app.AppCompatActivity;



import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    private static String make;
    private static String model;
    private static String color;
    private static int year;
    private static float mileage;
    Scanner scnr = new Scanner(System.in);
    private static int index;
    EditText editMake, editModel,editColor, editYear, editMileage;
    TextView VehicleList;
    private static final String FILE_NAME = "automobile.txt";
    Button RemoveVehicle, UpdateVehicle, AddVehicle, PrintFile;
    public static class AutomobileInv {
        private static String make;
        private static String model;
        private static String color;
        private static int year;
        private static float mileage;
        Scanner scnr = new Scanner(System.in);
        private static int index;
    }
    //try..catch no parameters
    public MainActivity() {
        String make;
        String model;
        String color;
        int year = 0;
        float mileage;
        int index;

        while (String.valueOf(year) == "") {
            try {

                year = year;
                System.out.println("Enter the car's year");
                System.out.println("Success!");
            } catch (Exception e) {
                System.out.println("Failure");
            }

        }


    }
    //parameters
    public MainActivity(String make, String model, String color, int year,
                        float mileage, int index) {
        super( );
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        this.index = index;

    }
    public static class Vehicle {


        public void addVehicle() {
            //Scanner scn = new Scanner(System.in);
            //System.out.println("Add Vehicle");
            //System.out.print("Enter Vehicle make: ");
            //String make = scn.nextLine( );
            //System.out.print("Enter Vehicle model: ");
            //String model = scn.nextLine( );
            // System.out.print("Enter Vehicle color: ");
            //String color = scn.nextLine( );
            //System.out.print("Enter Vehicle year: ");
            //int year = scn.nextInt( );
            //System.out.print("Enter Vehicle mileage: ");
            //int mileage = scn.nextInt( );
            //System.out.print("Enter the Vehicle Index Number: ");
            //int index = scn.nextInt( );
            AutomobileInv av = new AutomobileInv( );
            ArrayList cars = new ArrayList( );


            cars.add(av.make);
            cars.add(av.model);
            cars.add(av.color);
            cars.add(String.valueOf(av.year));
            cars.add(String.valueOf(av.mileage));
            System.out.println("Vehicle Added Successfully");
            System.out.println(av.make);
            System.out.println(av.model);
            System.out.println(av.color);
            System.out.println(av.year);
            System.out.println(av.mileage);
        }

        public void removeVehicle() {
            //Scanner scn = new Scanner(System.in);
            //System.out.println("Add Vehicle");
            //System.out.print("Enter Vehicle make: ");
            //String make = scn.nextLine( );
            //System.out.print("Enter Vehicle model: ");
            //String model = scn.nextLine( );
            // System.out.print("Enter Vehicle color: ");
            //String color = scn.nextLine( );
            //System.out.print("Enter Vehicle year: ");
            //int year = scn.nextInt( );
            //System.out.print("Enter Vehicle mileage: ");
            //int mileage = scn.nextInt( );
            //System.out.print("Enter the Vehicle Index Number: ");
            //int index = scn.nextInt( );
            AutomobileInv av = new AutomobileInv( );
            ArrayList cars = new ArrayList( );


            cars.remove(av.make);
            cars.remove(av.model);
            cars.remove(av.color);
            cars.remove(String.valueOf(av.year));
            cars.remove(String.valueOf(av.mileage));
            System.out.println("Vehicle Removed Successfully");

        }
        public void updateVehicle() {
            //Scanner scn = new Scanner(System.in);
            //System.out.println("Add Vehicle");
            //System.out.print("Enter Vehicle make: ");
            //String make = scn.nextLine( );
            //System.out.print("Enter Vehicle model: ");
            //String model = scn.nextLine( );
            // System.out.print("Enter Vehicle color: ");
            //String color = scn.nextLine( );
            //System.out.print("Enter Vehicle year: ");
            //int year = scn.nextInt( );
            //System.out.print("Enter Vehicle mileage: ");
            //int mileage = scn.nextInt( );
            //System.out.print("Enter the Vehicle Index Number: ");
            //int index = scn.nextInt( );
            AutomobileInv av = new AutomobileInv( );
            ArrayList cars = new ArrayList( );




            while (index < 0) {
                av.index = cars.indexOf(av.make);
                cars.set(av.index, av.make);

                av.index = cars.indexOf(av.model);
                cars.set(av.index, av.model);

                av.index = cars.indexOf(av.color);
                cars.set(av.index, av.color);

                av.index = cars.indexOf(av.year);
                cars.set(av.index, String.valueOf(av.year));

                av.index = cars.indexOf(av.mileage);
                cars.set(av.index, String.valueOf(av.mileage));

            }
            System.out.println(av.make);
            System.out.println(av.model);
            System.out.println(av.color);
            System.out.println(av.year);
            System.out.println(av.mileage);
            System.out.println("Vehicle Updated Successfully");
        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            editMake  = (EditText) findViewById(R.id.editMake);
            editModel = (EditText) findViewById(R.id.editModel);
            editColor  = (EditText) findViewById(R.id.editColor);
            editYear = (EditText) findViewById(R.id.editYear);
            editMileage = (EditText) findViewById(R.id.editMileage);
            VehicleList = (TextView) findViewById(R.id.VehicleList);
            RemoveVehicle = (Button) findViewById(R.id.RemoveVehicle);
            UpdateVehicle = (Button) findViewById(R.id.UpdateVehicle);
            AddVehicle = (Button) findViewById(R.id.AddVehicle);
            PrintFile = (Button) findViewById(R.id.PrintFile);

            AddVehicle.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    AutomobileInv av = new AutomobileInv();
                    av.make = editMake.getText().toString();
                    av.model = editModel.getText().toString();
                    av.color = editColor.getText().toString();
                    av.year = Integer.parseInt(editYear.getText().toString());
                    av.mileage = Float.parseFloat(editMileage.getText().toString());
                    VehicleList.setText("Make:\t" + av.make + "\nModel:\t" + av.model+ "\nColor:\t"+ av.color+ "\nYear:\t"+ av.year+"\nMileage:\t"+ av.mileage);
                    MainActivity.Vehicle vehicle = new Vehicle();
                    vehicle.addVehicle();


                }
            });
        RemoveVehicle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                VehicleList.setText("Make:\t" + "Removed" + "\nModel:\t" + "Removed" + "\nColor:\t"+ "Removed" + "\nYear:\t"+ "Removed" +"\nMileage:\t"+ "Removed" );
                MainActivity.Vehicle vehicle = new Vehicle();
                vehicle.removeVehicle();


            }
        });

        UpdateVehicle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AutomobileInv av = new AutomobileInv();
                av.make = editMake.getText().toString();
                av.model = editModel.getText().toString();
                av.color = editColor.getText().toString();
                av.year = Integer.parseInt(editYear.getText().toString());
                av.mileage = Float.parseFloat(editMileage.getText().toString());
                VehicleList.setText("Make:\t" + av.make + "\nModel:\t" + av.model+ "\nColor:\t"+ av.color+ "\nYear:\t"+ av.year+"\nMileage:\t"+ av.mileage);
                MainActivity.Vehicle vehicle = new Vehicle();
                vehicle.updateVehicle( );


            }
        });

        PrintFile.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AutomobileInv av = new AutomobileInv();
                av.make = editMake.getText().toString();
                av.model = editModel.getText().toString();
                av.color = editColor.getText().toString();
                av.year = Integer.parseInt(editYear.getText().toString());
                av.mileage = Float.parseFloat(editMileage.getText().toString());
                VehicleList.setText("Make:\t" + "Printed to File" + "\nModel:\t" + "Printed to File" + "\nColor:\t"+ "Printed to File" + "\nYear:\t"+ "Printed to File" +"\nMileage:\t"+ "Printed to File" );
                Toast.makeText(MainActivity.this, "Saved!", Toast.LENGTH_LONG).show();
                FileOutputStream FOS = null;
                try {
                    FOS = openFileOutput(FILE_NAME, MODE_PRIVATE);
                    FOS.write(av.make.getBytes());
                    FOS.write(av.model.getBytes());
                    FOS.write(av.color.getBytes());
                    FOS.write(String.valueOf(av.year).getBytes());
                    FOS.write(String.valueOf(av.mileage).getBytes());
                    Toast.makeText(getApplicationContext(), "Saved to " + getFilesDir() + "/" + FILE_NAME,
                            Toast.LENGTH_LONG).show();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (FOS != null) {
                        try {
                            FOS.close( );
                        } catch (IOException e) {
                            e.printStackTrace( );
                        }
                    }
                }


        }
    });}}







