public  class overloading
{
int add()
{
return(10+10);
}
int add(int x,int y)
{
return(x+y);
}
float add(float a,float b)
{
return(a+b);
}
public static void main(String args[])
{
overloading a=new overloading();
System.out.println("Using default values sum is:"+a.add());

System.out.println("Using integer values sum is:"+a.add(10,20));
System.out.println("Using float values sum is:"+a.add(10.3f,20.4f));
}
}
