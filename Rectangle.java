import  java.util.*;
public class Rectangle {
    private float length;
    private float breadth;
    void inputData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth");
        this.length= sc.nextFloat();
        this.breadth= sc.nextFloat();
    }
    float calculateArea()
    {
        return length*breadth;
    }
    float caculatePerimeter()
    {
        return 2*(length+breadth);
    }
    void outputData()
    {
        System.out.println("Area is "+calculateArea());
        System.out.println("Perimeter is "+caculatePerimeter());
    }
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.inputData();
        r1.outputData();
    }
}
