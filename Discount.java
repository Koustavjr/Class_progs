import java.util.Scanner;

public class Discount {
    int cost;
    String name;
    double dc;
    double amt;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter cost and name");
        this.cost=sc.nextInt();
        this.name=sc.nextLine();
    }
    void cal()
    {
        if(cost<=5000)
            System.out.println("No discount");
        else {
            if(cost>5000 && cost<10000)
            {
                dc=0.1*cost;
                amt=cost-dc;
            } else if (cost>10000 && cost<15000) {
                dc=.15*cost;
                amt=cost-dc;
            }
            else
            {
                dc=0.2*cost;
                amt=cost-dc;
            }
        }
        System.out.print(dc+"        ");
        System.out.print(amt);
    }
    void display()
    {
        System.out.println("Name of the customer discount amount to be paid");
        System.out.print(name+"         ");
        cal();
    }

    public static void main(String[] args) {
        Discount d1=new Discount();
        d1.input();
        d1.display();
    }
}
