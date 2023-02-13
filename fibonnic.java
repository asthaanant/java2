import java.util.Scanner;
public class fibonnic {
    public static void main(String[] args){
        int x=0,y=1,z=0,num;
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
         num = sc.nextInt();
         for(z=0;z<=num;z=x+y)
         {
            System.out.println("value of z" +z);
            x=y;
            y=z;
         }
    } 
}
