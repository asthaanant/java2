import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int fact=1,i;
        int num = sc.nextInt();
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial=" +fact);
    } 
}
