import java.util.Scanner;
public class classandobject {
    int age,rollno;
    String name,address;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name:");
        name = sc.nextLine();
        System.out.println("enter rollno");
        rollno = sc.nextInt();
        System.out.println("enter address");
       address = sc.nextLine();
        System.out.println("enter age");
        age = sc.nextInt();
       sc.close();
    }
    void putdata()
    {
        System.out.println("name:" + name);
        System.out.println("rollno:" +rollno);
        System.out.println("age:" +age);
        System.out.println("address:" + address);
    }
    public static void main(String[] args){
     classandobject obj = new classandobject();
     obj.getdata();
     obj.putdata();   
    }
}
