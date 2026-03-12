package exam;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class VehicleRecord {
   private int year;
   private String plateNumber;
   private int[] serviceYears;
   private String regex = "^[A-Z]{2,3}-\\d{4}$";

   public VehicleRecord(int year, String plateNumber){
       this.year = year;
       this.plateNumber = plateNumber;
   }
   public int getYear(){return year;}
    public String getPlateNumber(){return plateNumber;}

    public void setYear(int year) {
        this.year = year;
    }
    public void setPlateNumber(String plateNumber){
       this.plateNumber = plateNumber;
    }
    static void newModel(int year, String plateNumber, int[] serviceYears){
        VehicleRecord c1 = new VehicleRecord(2026, 1D43D1);


       }
}
    /* Description

    Create a class Car representing a vehicle record.

    It must have:

    int year (1900–current year)
    String plateNumber (regex: ^[A-Z]{2,3}-\d{4}$)
    int[] serviceYears
    Requirements:



    Constructors (at least 2)
    Factories newModel(), oldModel(). setting the year property to appropriate values
    Validation and exceptions (for year & plateNumbe)
    StringBuilder for toString()
    JUnit tests validating plate format (1 regular test, 1 parameter test for year and plateNumber, totaling 4 tests)
*/}
