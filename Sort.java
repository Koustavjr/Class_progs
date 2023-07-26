import java.util.*;
public class Sort {
    private static int[]arr={1,2,5,7,9,5,4,6,2,8};
    static void arrange(int[]arr)
    {
        for (int i = 0; i < arr.length-1 ; i++) {
            boolean f=true;
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    f=false;
                }
            }
            if(f)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
   static void search(int[]arr,int lb,int ub)
    {  int f=0;
        Arrays.sort(arr);
        System.out.println("Enter item to be searched");
        Scanner sc=new Scanner(System.in);
       int it= sc.nextInt();
        while (lb<=ub)
        {
            int mid=(ub+lb)/2;
            if(arr[mid]==it)
            {
                f=1;break;
            }
            else if(arr[mid]>it)
                ub=mid-1;
            else
                lb=mid+1;
        }
        if(f==1)
            System.out.println("item found");
        else
            System.out.println("item not found");
    }

    public static void main(String[] args) {
        arrange(arr);
        search(arr,0,9);
    }
}
