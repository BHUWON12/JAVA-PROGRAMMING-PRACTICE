import java.util.Scanner;
public class addmatrix
{
    public static void main(String args[])
    {
    int row,col;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of matrix A & B");
    System.out.println("Enter row size");
    row=sc.nextInt();
    System.out.println("Enter column size");
    col=sc.nextInt();
   int a[][]=new int[row][col];
   int b[][]=new int[row][col];
   int i,j;
   System.out.println("enter the values of matrix A:");
   for(i=0;i<row;i++)
   {
    for(j=0;j<col;j++)
    {
        a[i][j]=sc.nextInt();
    }}
   
   System.out.println("Enter the values if matrix B");
   for(i=0;i<row;i++)
   {
    for(j=0;j<col;j++)
    {
        b[i][j]=sc.nextInt();
    }
   }
    System.out.println("matrix A:");
    for( i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
          System.out.print("\t"+a[i][j]);
        }
        System.out.print("\n");
    }
     System.out.println("matrix B:");
    for( i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
           System.out.print("\t"+b[i][j]);  
        }
         System.out.print("\n");
    }
    System.out.println("the addition of matrix ");
     for( i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
           System.out.print("\t"+(a[i][j]+b[i][j]));  
        }
         System.out.print("\n");
    }

}}
