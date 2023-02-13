import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,ch;
        System.out.println("enter the value of a and b to perform a calculation");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("enter your choice 1->addition 2->substraction 3->multiplication 4->division");
        ch = sc.nextInt();
        switch(ch){
        case 1:
            System.out.println("additon:" +(a+b));
            break;
        case 2:
            System.out.println("substraction:" +(a-b));
            break;
        case 3:
            System.out.println("multiplication:" +(a*b));
            break;
        case 4:
            System.out.println("division:" +(a/b));
            break;
        default:
            System.out.println("invalid choice");
        }
    }
}
