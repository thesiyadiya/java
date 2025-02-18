class method
{
    public static void main(String a[])
    {
        System.out.print("\n Main Method");
        test1 t1=new test1();
        t1.demo();
        view();
    }
    public void demo()
    {
        System.out.print("\n Non-static Method");
    }
    public static void view()
    {
        System.out.print("\n Staic Method");
    }
}