import java.util.Scanner;
public class function2 {
    public static int sumodd(int n){
            for(int i=1;i<=n;i++){
                if(i%2!=0){
                int sum=0;
                sum=sum+i;
            }
        }
        return n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        int sum = sumodd(a);
        System.out.println("sum:" +sum);
    }

}
