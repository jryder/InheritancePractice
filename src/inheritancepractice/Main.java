/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;
/**
 *
 * @author Jordan Ryder
 */
public class Main {
    public static void main(String[] args) {

        
        
        //salary employee
        concrete.SalariedEmployee e2 = new concrete.SalariedEmployee();
        e2.setSalary(20000.00);
        e2.setAge(30);
        e2.setDepartment("Business Intelligence");
        e2.setFirstName("Jordan");
        e2.setLastName("Ryder");
        System.out.println(e2.getFullName() + " works in " + e2.getDepartment() + " and makes $" + e2.getSalary()+ " per year.");
       
        
        //Hourly Employee
        concrete.HourlyEmployee e1 = new concrete.HourlyEmployee();
        e1.setHourlyRate(5.00);
        e1.setAge(30);
        e1.setDepartment("Business Intelligence");
        e1.setFirstName("Jordan");
        e1.setLastName("Ryder");
        System.out.println(e1.getFullName() + " works in " + e1.getDepartment() + " and makes $" + e1.getHourlyRate() + " per hour.");
       
        
        //Hourly Plus Bonus
        concrete.SalaryPlusBonusEmployee e3 = new concrete.SalaryPlusBonusEmployee();
        e3.setSalary(15000.00);
        e3.setAnnualBonus(2000);
        e3.setAge(30);
        e3.setDepartment("Business Intelligence");
        e3.setFirstName("Jordan");
        e3.setLastName("Ryder");
        System.out.println(e2.getFullName() + " works in " + e2.getDepartment() + " and makes $" + e2.getSalary()+ " per year plus a $" + e3.getAnnualBonus() + " bonus" );
        
        
        
        //test inheritance package

        
        
        
    }
    
    
    
    
    
    

}
