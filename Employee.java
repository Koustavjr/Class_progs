import java.util.*;
public class Employee {
    private int pan;
    private String name;
    double income;
    double tax=0.0;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter pan");
        this.pan=sc.nextInt();
        System.out.println("Enter name");
        this.name=sc1.nextLine();
        System.out.println("Enter Income");
        this.income=sc.nextDouble();
    }
    void cal()
    {
        if(income<=250000)
            System.out.println("No tax");
        else {
            if(income>250000 && income<=500000)
                tax=0.1*(income-250000);
            else if (income>500000 &&income<1000000)
                tax=30000+0.2*(income-500000);
            else
                tax=50000+0.3*(income-1000000);
        }
        System.out.println(tax);
    }
    void display()
    {
        Employee e1=new Employee();
        System.out.println("Pan Number  Name  Tax Income  Tax");
        System.out.print(pan+"  "+name+"  "+income+"  ");
       // cal();
    }

    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.input();
        e1.display();
        e1.cal();
    }
}
