import java.util.*;
public class Telephone {
int prv;
int pre;
int call;
String name;
double amt;
double total;
void input()
{
    System.out.println("Enter prev pre and name");
    Scanner sc= new Scanner(System.in);
    Scanner sc1=new Scanner(System.in);
    this.prv= sc.nextInt();
    this.pre= sc.nextInt();
    this.name=sc1.nextLine();
}
void cal()
{
     call=Math.abs(pre-prv);
    if(call<=100)
        System.out.println(180);
    else
    {
        if(call>100 && call<=200)
        {
            amt=0.9*(call-100);
            total=180+amt;
        }
        else if (call>200 && call<=400)
        {
            amt=0.9*100+0.8*(call-200);
            total=180+amt;
        }
        else {
            amt=0.9*100+0.8*200+0.7-(call-400);
            total=180+amt;
        }
    }
    System.out.print(call+"   ");
    System.out.print(total);
}
void display()
{
    System.out.println("Name of the customer Calls made Amount to be paid");
    System.out.print(name+"      ");
    cal();
}

    public static void main(String[] args) {
        Telephone t1=new Telephone();
        t1.input();
        t1.display();
    }
}
