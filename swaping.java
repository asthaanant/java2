import java.util.Scanner;
public class swaping {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,temp;
        System.out.println("enter the value of a");
         a = sc.nextInt();
        System.out.println("enter the value of b");
         b = sc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping" +a);
        System.out.println("after swapping" +b);
    }
}
