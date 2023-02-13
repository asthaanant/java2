import java.util.Scanner;
public class function1 {
   public static int average(int a,int b,int c){
    int avg = (a+b+c)/3;
    return avg;
   } 
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of a,b,c:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int avg = average(a, b, c);
    System.out.println("average:" +avg);
    sc.close();
   }
}
