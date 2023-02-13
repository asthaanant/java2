import java.util.Scanner;
public class additonthroughclass {
    int a,b;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a and b");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
    }
    void putdata()
        {
            System.out.println("addition =" +(a+b));
        }
    public static void main(String[] args){
        additonthroughclass aa = new additonthroughclass();
        aa.getdata();
        aa.putdata();
    }
    
}
