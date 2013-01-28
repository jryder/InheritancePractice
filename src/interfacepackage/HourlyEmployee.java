

package interfacepackage;

/**
 *
 * @author Jordan Ryder
 */
public class HourlyEmployee implements Employee {
    double hourlyRate;
    String firstName;
    String lastName;

    public double getHourlyRate() {
        return hourlyRate;
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

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
      public String getFullName() {
        return this.firstName + " " + this.lastName;
    }      
    
}
