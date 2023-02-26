package _IEmployee;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    public int calculateSalary(){
        return 4*30*getPaymentPerHour();
    }
}
