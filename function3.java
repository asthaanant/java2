import java.util.Scanner;

public class function3 {
    public static void greater(int a, int b){
        if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
         greater(a,b);
         sc.close();
    }
}
