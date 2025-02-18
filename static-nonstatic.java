class method
{
    public static void main(String a[])
    {
        System.out.println("Main Method");
        method m1=new method();
        m1.demo();
        view();
    }
    public void demo()
    {
        System.out.println("Non-static Method");
    }
    public static void view()
    {
        System.out.println("Staic Method");
    }
}