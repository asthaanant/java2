import java.util.Scanner;
public class palidrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for palindrome");
        int num = sc.nextInt();
        int orig,rev=0;
        orig=num;
        while(num>0){
            rev=(rev*10)+num%10;
            num=num/10;
        }
        if(orig==rev)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
