/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardemo;

/**
 *
 * @author gwestmoreland
 */
public class Car extends Vehicle
 {
    // This instance variable is added to the subclass
    private String licensePlateNumber;
    
    public Car()
    {
       // Use the public interface to access the instance variable of the superclass
       setNumberOfTires(4); // same as this.setNumberOfTires(4)
       licensePlateNumber = "RX7-428";
    }
 
    // This method is added to the subclass
    public void setLicensePlateNumber(String newValue)
    {
       licensePlateNumber = newValue;
    }
 
    // This method overrides a method from the superclass
    public String getDescription() 
    {
      return "A car with license plate " + licensePlateNumber;
    }
 
    // This class inherits the getNumberOfTires and setNumberOfTires methods
    }