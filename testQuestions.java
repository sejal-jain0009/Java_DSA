import java.util.*;
//ques1. - print factorial
/*public class testQuestions {
    public static int factorial(int n){
        if(n==0||n==1) return 1;
        return (n)*factorial(n-1);
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
    System.out.println(factorial(n));
    }
}*/

//ques2. - print sum of digits of a number
class Main{
    public static int sumOfDigits(int n){
        if(n==0) return 0;
        return (n%10)+sumOfDigits(n/10);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(n<0) System.out.println(-sumOfDigits(-n));
        else System.out.println(sumOfDigits(n));
    }
}
