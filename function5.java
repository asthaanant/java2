import java.util.Scanner;

public class function5 {
    public static int vote(int age){
        if(age<18){
            System.out.println("NOT ELIGIBLE TO VOTE");
        }
        else{
            System.out.println("ELIGIBLE TO VOTE");
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER AGE");
        int age = sc.nextInt();
         vote( age);
         sc.close();
    }
}
