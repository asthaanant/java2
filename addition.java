import java.util.Scanner;
 public class addition {    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two string");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(str1+str2);
        sc.close();
    }

}
