class arithmetic1
{
     public static void main(String s[])
     {
        int a=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
        int choice=Integer.parseInt(s[2]);
        int c;
        System.out.println("A ="+a+"B ="+b);
        switch(choice)
        {
            case 1:
                    c=a+b;
                    System.out.println("Sum :"+c);
                    break;
            case 2:
                    c=a-b;
                    System.out.println("Sub :"+c);
                    break;   
            case 3:
                    c=a*b;
                    System.out.println("Mul :"+c);
                    break;   
            case 4:
                    c=a/b;
                    System.out.println("Div :"+c);
                    break;   
            case 5:
                    c=a%b;
                    System.out.println("Mod :"+c);
                    break; 
            default:
                     System.out.println("Invalid");
                     break;    
        }
     }
}
/* 
PS C:\diya\java> javac arithmetic.java
PS C:\diya\java> java arithmetic 20 10 1
A =20B =10
Sum :30
*/