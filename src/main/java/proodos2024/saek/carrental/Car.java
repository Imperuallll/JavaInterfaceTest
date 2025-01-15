/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proodos2024.saek.carrental;

/**
 *
 * @author User
 */
public class Car implements Rentable{
    String name;
    int price;
    String kausima;
    String tupos;

    
    public double calculateRent( int days){
        return price*days;
    }
    
    
    
   public Car(String name, int price, String kausima, String tupos){
        this.name = name;
        this.price = price;
        this.kausima = kausima;
        this.tupos = tupos;
   }

   void displayInfo() {
       System.out.println("name of car is:"+ "  "+name + "price:"+ price );
       System.out.println("kausima"+ kausima + "  "+" tupos odhgou"+ tupos);
    }
    
    
    
    
}
