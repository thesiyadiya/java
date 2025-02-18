import java.util.*;
class SingleDigit{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int singleDigit = covertToSingleDigit(number);
        System.out.println("The single digit is:"+singleDigit);
    }
    public static int covertToSingleDigit(int num){
        while (num >=10){
            num = sumOfDigit(num);
        }
        return num;
    }
    public static int sumOfDigit(int num){
        int sum=0;
        while(num > 0){
            sum += num %  10;
            num /= 10;
         }
        return sum;
     }
}

/*
output:-
PS C:\diya\java> javac convert1digit.java
PS C:\diya\java> java SingleDigit
Enter a number: 345
The single digit is:3

logic:-
sum=0
345 % 10= 5 --> sum=0+5=5
345/10=34

sum=5
34 % 10= 4 -->sum=5+4=9
34/10=3

sum=9
3 % 10=3 --> sum=3+5+4=12
3/10=0

sum=12
convert to single digit=1+2-->3 
*/