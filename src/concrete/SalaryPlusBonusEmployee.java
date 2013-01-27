
package concrete;

/**
 *
 * @author Jordan Ryder
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    double AnnualBonus;

    public double getAnnualBonus() {
        return this.AnnualBonus;
    }

    public void setAnnualBonus(double AnnualBonus) {
        this.AnnualBonus = AnnualBonus;
    }
}
