

package abstractpackage;

public abstract class Employee {
    private String FirstName;
    private String LastName;
    private String Department;
    private int Age;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    
    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getFullName() {
        return FirstName + " " + LastName;
    }    
    
    
    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
    //each employee may have additional calculations for pay (deductions, taxes, etc.)
    public abstract double calculatePay();
    
    //This needs to be done to calculate quarterly bonuses if applicable
    public abstract double calculateBonus();
   
    
}



