class spr2
{
    spr2()
    {
        System.out.println("THIS IS SPR2 CLASS");
    }
    spr2(String a)
    {
        System.out.println("NAME= "+a);
    }
    public static void main(String s[])
    {
        spr2 a=new spr2();
        a=new spr2(s[0]);
    }
} 


//PS C:\diya\java> javac constructeroverloading.java
//PS C:\diya\java> java spr2 diya
//THIS IS SPR2 CLASS
//NAME= diya

//PS C:\diya\java> javac constructeroverloading.java
//PS C:\diya\java> java spr2 diya thesiya
//THIS IS SPR2 CLASS
//NAME= diya
//PS C:\diya\java> javac constructeroverloading.java
//PS C:\diya\java> java spr2 "diya thesiya"
//THIS IS SPR2 CLASS
//NAME= diya thesiya 
