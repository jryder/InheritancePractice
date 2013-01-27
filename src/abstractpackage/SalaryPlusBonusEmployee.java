
package abstractpackage;

/**
 *
 * @author Jordan Ryder
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    double AnnualBonus;

    public double getAnnualBonus() {
        return AnnualBonus;
    }
    public void setAnnualBonus(double AnnualBonus) {
        this.AnnualBonus = AnnualBonus;
    }
    
    //return superclass pay plus annual bonus, should only be run annually
    public double calculatePayWithBonus () {
        return calculatePay() + AnnualBonus;
    
    }    
}
