package _IEmployee;

public class TestEmployee {
    public static void main(String[] args){
        IEmployee a = new Employee("AA",20);
        IEmployee b = new PartTimeEmployee("GG",20,8);
        IEmployee c = new FullTimeEmployee("MM",20);
        IEmployee [] list = {a,b,c};
        for(IEmployee i: list){
            System.out.println("Name = "+ i.getname()+", Salary = "+i.calculatesalary());
        }


    }
}
