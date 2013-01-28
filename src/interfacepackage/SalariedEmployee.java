

package interfacepackage;

/**
 *
 * @author Jordan Ryder
 */
public class SalariedEmployee implements Employee  {
    
    double salary;
    String firstName;
    String lastName;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
        @Override
    public void setFirstName(String s) {
       this.firstName = s; 
    }
    
    @Override
    public void setLastName(String s) {
        this.lastName = s;
    }
    
    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
    
      public String getFullName() {
        return this.firstName + " " + this.lastName;
    }        
    
    
}
