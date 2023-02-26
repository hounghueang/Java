package _IEmployee;

public class Employee implements IEmployee {
    String name;
    int paymentPerHour;

    public String getName() {
        return name;
    }

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        paymentPerHour = paymentPerHour;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public int calculatesalary() {
        return 8*30;
    }
}
