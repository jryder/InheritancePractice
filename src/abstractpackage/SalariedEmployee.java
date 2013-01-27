

package abstractpackage;

/**
 *
 * @author Jordan Ryder
 */
public class SalariedEmployee extends Employee  {
    
    double salary;
    int payPeriods;

    public double getSalary() {
        return salary;
        
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getPayPeriods() {
        return payPeriods;
    }

    public void setPayPeriods(int payPeriods) {
        this.payPeriods = payPeriods;
    }

    @Override
    public double calculatePay() {
        return salary / payPeriods;
    }

    @Override
    public double calculateBonus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
