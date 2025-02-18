import java.util.*;
abstract class student
{
    abstract void home1();
}
class subject extends student
{
    void home1()
    {
        System.out.println("hello");
    }
}
class home1{
    public static void main(String s[])
    {
        home1();
    }
    public static void home1()
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value1: ");
        a=sc.nextInt();
        System.out.print("Enter value2 :");
        b=sc.nextInt();
        c=a+b;
        System.out.println("Sum: "+c);
       c=a-b;
        System.out.println("Sub: "+c); 
        c=a*b;
        System.out.println("Mul: "+c); 
        c=a/b;
        System.out.println("Div: "+c); 
    }
}
/*
PS C:\diya\java> javac defination4.java
PS C:\diya\java> java home1
Enter value1: 40
Enter value2 :20
Sum: 60
Sub: 20
Mul: 800
Div: 2 */