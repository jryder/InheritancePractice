

package abstractpackage;

/**
 *
 * @author Jordan Ryder
 */
public class HourlyEmployee extends Employee {
    double hourlyRate;
    double hoursWorked;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    
    //this was kind of cool to handle something that still needs to be developed.
    @Override
    public double calculateBonus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
}
