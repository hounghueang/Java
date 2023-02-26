package _IEmployee;

public class PartTimeEmployee extends Employee {
    int WorkingHours;
    public PartTimeEmployee(String name, int paymentPerHour, int WorkingHours) {
        super(name, paymentPerHour);
        this.WorkingHours = WorkingHours;
    }

    public int getWorkingHours() {
        return WorkingHours;
    }
    public int calculateSalary(){
        return WorkingHours*getPaymentPerHour();
    }
}
