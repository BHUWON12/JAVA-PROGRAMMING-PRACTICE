public class DBZ {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try
        {
            System.out.println(a/b);

        }
        
        catch(ArithmeticException e)
        {
            System.out.println("the devison is not possible");
        }
    }
}
