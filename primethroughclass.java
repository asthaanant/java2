import java.util.Scanner;
public class primethroughclass {
   int n,count=0,i;
   void getdata()
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
   }
   void putdata()
   {
    for(i=1;i<=n;i++)
    {
        if(n%i==0)
        count = count+1;
    }
    if(count==2)
    {
        System.out.println("number is prime");
    }
    else{
        System.out.println("number is not prime");
    }
   }
   public static void main(String[] args){
    primethroughclass pp = new primethroughclass();
    pp.getdata();
    pp.putdata();
    }
   }
