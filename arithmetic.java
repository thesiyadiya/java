class arithmetic
{
    public static void main(String s[])
    {
        int a,b,c;
        a=Integer.parseInt(s[0]);
        b=Integer.parseInt(s[1]);
        System.out.println("A="+a+" B="+b);
        c=a+b;
        System.out.println("Sum:"+c);
        c=a-b;
        System.out.println("Sub:"+c);
        c=a*b;
        System.out.println("Mul:"+c);
        c=a/b;
        System.out.println("Div:"+c);
        c=a%b;
        System.out.println("Mod:"+c);
    }
}

/*
PS C:\diya\java> javac arithmetic.java
PS C:\diya\java> java arithmetic 10 20
A=10 B=20
Sum:30
Sub:-10
Mul:200
Div:0
Mod:10
*/