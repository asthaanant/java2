import java.util.Scanner;

public class function4 {
   public static int circumference(int r){
    int c = 2*(22/7)*r;
    return c;
   } 
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter radius");
    int r = sc.nextInt();
   int c = circumference(r);
    System.out.println("circumference" +c);
    sc.close();
   }
}
