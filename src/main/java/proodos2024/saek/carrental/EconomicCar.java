/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proodos2024.saek.carrental;

/**
 *
 * @author User
 */
public class EconomicCar extends Car{

    public EconomicCar(String name, int price, String kausima, String tupos) {
        super(name, price, kausima, tupos);
    }

    

    void displayInfo(){
       System.out.println("name of car is:"+ name + "price:"+ price );
       System.out.println("kausima"+ kausima + " tupos odhgou"+ tupos);
   }
    
    
    
}
