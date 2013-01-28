

package inheritancepractice;
/**
 *
 * @author Jordan Ryder
 */
public class Main {
    public static void main(String[] args) {

        
        
        System.out.println("");
        System.out.println("...");
        System.out.println("Concrete");
        System.out.println("");
        
        
        
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
        
        
        
        System.out.println("");
        System.out.println("...");
        System.out.println("interface");
        System.out.println("");
        
        //salary employee
        interfacepackage.SalariedEmployee e4 = new interfacepackage.SalariedEmployee();
        e4.setSalary(40000.00);
        e4.setFirstName("Jordan");
        e4.setLastName("Ryder");
        System.out.println(e4.getFullName() + " makes $" + e4.getSalary()+ " per year.");
       
        
        //Hourly Employee
        interfacepackage.HourlyEmployee e5 = new interfacepackage.HourlyEmployee();
        e5.setHourlyRate(5.00);
        e5.setFirstName("Jordan");
        e5.setLastName("Ryder");
        System.out.println(e5.getFullName() +  " makes $" + e5.getHourlyRate() + " per hour.");
       
        
        //Hourly Plus Bonus
        interfacepackage.SalaryPlusBonusEmployee e6 = new interfacepackage.SalaryPlusBonusEmployee();
        e6.setSalary(15000.00);
        e6.setAnnualBonus(2000);
        e6.setFirstName("Jordan");
        e6.setLastName("Ryder");
        System.out.println(e2.getFullName() + " works in " + e2.getDepartment() + " and makes $" + e2.getSalary()+ " per year plus a $" + e6.getAnnualBonus() + " bonus" );
    
        
        System.out.println("");
        System.out.println("...");      
        System.out.println("abstract"); 
        System.out.println("");
        
         //salary employee
        abstractpackage.SalariedEmployee e7 = new abstractpackage.SalariedEmployee();
        e7.setSalary(70000.00);
        e7.setFirstName("Jordan");
        e7.setLastName("Ryder");
        System.out.println(e7.getFullName() + " makes $" + e7.getSalary()+ " per year.");
       
        
        //Hourly Employee
        abstractpackage.HourlyEmployee e8 = new abstractpackage.HourlyEmployee();
        e8.setHourlyRate(8.00);
        e8.setFirstName("Jordan");
        e8.setLastName("Ryder");
        System.out.println(e8.getFullName() +  " makes $" + e8.getHourlyRate() + " per hour.");
       
        
        //Hourly Plus Bonus
        abstractpackage.SalaryPlusBonusEmployee e9 = new abstractpackage.SalaryPlusBonusEmployee();
        e9.setSalary(15000.00);
        e9.setAnnualBonus(2000);
        e9.setFirstName("Jordan");
        e9.setLastName("Ryder");
        System.out.println(e2.getFullName() + " works in " + e2.getDepartment() + " and makes $" + e2.getSalary()+ " per year plus a $" + e9.getAnnualBonus() + " bonus" );
           
        
        
        
        
    }
    
    
    
    
    
    

}
