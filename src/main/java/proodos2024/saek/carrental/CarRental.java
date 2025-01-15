/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proodos2024.saek.carrental;

/**
 *
 * @author john sounas
 */
public class CarRental {

    public static void main(String[] args) {
        
        System.out.println("Welcome to rentalCar");
        
        SUVCar suv1 = new SUVCar("bmw",23000,"electric","a");
        suv1.displayInfo();
        
        LuxuryCar lux1 = new LuxuryCar("mercedes",50300,"gas","b");
        lux1.displayInfo();
       
        Rentable suv2 = new SUVCar ("ef",234,"rew","s");
        //suv2.calculateRent(3);
            System.out.println("suv2"+ suv2.calculateRent(3));
    }
}
