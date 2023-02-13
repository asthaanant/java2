import java.util.Scanner;
public class prime {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n,count=0,i;
    System.out.println("enter a number");
    n = sc.nextInt();
    for(i=1;i<=n;i++)
    {
        if(n%i==0)
        count=count+1;
    }
    if(count==2)
    System.out.println("number is prime");
    else
    System.out.println("not prime");
    }
}
