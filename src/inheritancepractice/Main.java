/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;
import concrete.*;
/**
 *
 * @author Jordan Ryder
 */
public class Main {
    public static void main(String[] args) {

        
        
        //salary employee
        concrete.SalariedEmployee e2 = new concrete.SalariedEmployee();
       
        e2.setSalary(20000.00);
        
        e2.;
          
        
        
        
       //test concreate package
        concrete.HourlyEmployee e1 = new concrete.HourlyEmployee();
       
        e1.setHourlyRate(5.00);
        
        e1.setAge(30);
        e1.setDepartment("Business Intelligence");
        e1.setFirstName("Jordan");
        e1.setLastName("Ryder");
        
        System.out.println(e1.getFullName() + " works in " + e1.getDepartment() + " and makes $" + e1.getHourlyRate() + " per hour.");
       
        

        
        
        
        //test inheritance package

        
        
        
    }
    
    
    
    
    
    

}
