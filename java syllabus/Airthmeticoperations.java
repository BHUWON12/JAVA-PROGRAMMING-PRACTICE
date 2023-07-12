class AddSub
{
int n1,n2;
public AddSub(int x,int y)
{
n1=x;
n2=y;
}
public int add()
{
return(n1+n2);
}
public int sub()
{
return(n1-n2);
}}
class MulDiv extends AddSub
{
    public MulDiv(int x,int y)
{
super(x,y);
}
public int mul()
{
return(n1*n2);
}
public int div()
{
return(n1/n2);
}
}
public class Airthmeticoperations
{
public static void main(Sting args[])
{
MulDiv ob=new MulDiv(20,10);
System.out.println("sum=:"+ob.add());
System.out.println("Difference=:"+ob.sub());
System.out.println("Product=:"+ob.mul());
System.out.println("division=:"+ob.div());
}
}