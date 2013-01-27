/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

/**
 *
 * @author jorda_000
 */
public class Main {
    public static void main(String[] args) {

       //test concreate package
        concrete.HourlyEmployee e1 = new concrete.HourlyEmployee();
       
        e1.setHourlyRate(5.00);
        System.out.println(e1.getHourlyRate());
        
        e1.setAge(30);
        e1.setDepartment("Business Intelligence");
        e1.setFirstName("Jordan");
        e1.setLastName("Ryder");
        
        System.out.println(e1.getFullName() + " works in " + e1.getDepartment() + " and makes $" + e1.getHourlyRate() + " per hour.");
       
        
        //test inheritance package
        
        
        
        
    }
    
    
    
    
    
    

}
