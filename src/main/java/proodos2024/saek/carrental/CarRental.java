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
       
        EconomicCar ec1 = new EconomicCar("opel",4300,"gas","c");
        ec1.displayInfo();
        
        Rentable suv2 = new SUVCar ("ef",234,"rew","s");
        
            System.out.println("suv2"+ suv2.calculateRent(3));
 
            Rentable [] cars = new Rentable[5];
            //int [] days = new int [5];
           cars [0]= suv1;
           cars[1]= lux1;
          // cars[2]= 
           
            int[] days = {2,3,10,8,12};
            double totalcost=0.0;
            
            for (int i = 0; i < cars.length; i++) {
            double cost = cars[i].calculateRent(i);
            totalCost += cost;
                System.out.println("Car"+ cars[i].getClass().getSimpleName() + ": "
                + cost + "gia"+ days[i] + "meres." );
       }
    }
}
