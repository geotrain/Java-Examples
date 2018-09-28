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
public class CarDemo
{
    public static void print(Car c)
    {
       System.out.println(c.getDescription());
       System.out.println("Tires: " + c.getNumberOfTires());
    }
    public static void main(String[] args)
    {
      Car aPlainCar = new Car(); 
      print(aPlainCar); 
      Car aLimo = new Car(); 
      aLimo.setLicensePlateNumber("MY5-338"); 
      aLimo.setNumberOfTires(8);
      print(aLimo);
    }
 }