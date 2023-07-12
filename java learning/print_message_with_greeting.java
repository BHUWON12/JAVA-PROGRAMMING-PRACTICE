import java.util.Scanner;
public class print_message_with_greeting {
    public static void main(String args[])
    {
        System.out.println("enter your name:");
        Scanner sc= new Scanner(System.in);
        String name= sc.next();
        System.out.println("hello "+name+" good evening ");

    }
}
