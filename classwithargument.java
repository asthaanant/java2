import java.util.Scanner;
public class classwithargument {
    int n;
    void getdata(int i){
        n=i;
    }
    void putdata()
    {
        while(n>0){
            int rev=0;
            rev=(rev*10)+n%10;
            n=n/10;        
        System.out.println("reverse=" +rev);}
    }
public static void main(String[] args)
{
    classwithargument ar = new classwithargument();
    System.out.println("enter the number for reverse");
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    ar.getdata(m);
    ar.putdata();
}

}
