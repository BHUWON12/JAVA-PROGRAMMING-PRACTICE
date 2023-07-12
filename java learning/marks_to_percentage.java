import java.util.Scanner;
public class marks_to_percentage {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("This program calcualates the percentage of the given marks(total:500 & per sub: 100)");
        System.out.println("enter marks of English:");
        float English= sc.nextByte();
        System.out.println("enter the marks of science");
        float science= sc.nextByte();
        System.out.println("enter the marks of hindi");
        float hindi= sc.nextByte();
        System.out.println("enter the marks of math");
        float math=sc.nextByte();
        System.out.println("enter the marks of computer");
        float computer=sc.nextByte();
        float sum= English+ science+hindi+math+computer;
        float pct=(sum/500*100);
       System.out.println("total marks="+sum+"\npercentage="+pct);
       float cgpa=pct/10;
       System.out.println("the CGPA of the student is:"+cgpa);




    }
    
}
