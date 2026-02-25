//FA1
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
/*class Main{
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
}*/

//ques3. fibonacci series
/*class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fib(i)+" ");
        }
    }
    public static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-1)+fib(n-2);
    }
}*/

//ques - missing element in array
/*class Main{
    public static void main(String args[]){
        int n=5;
        int[] arr={0,1,3,4,5};
        int ans=0;
        for(int i=0;i<=n;i++)
        {
            ans^=i;
        }
        for(int num:arr){
            ans^=num;
        }
        System.out.println(ans);
    }
}*/

//ques - set ith bit
/*class Main{
    public static void main(String args[]){
        int n=6; //0110
        int i=3;
        n=n|(1<<i);//1110
        System.out.println(n);
    }
}*/

//ques - right most set bit of a number
/*class Main{
    public static void main(String args[]){
        int n=5;//0101
        System.out.println(n & (-n)); //0101 & 1011 = 0001
    }
}*/

//ques - add first and last digit of a number
/*class Main{
    public static void main(String args[]){
        int n=12345;
        int last=n%10; //5
        while(n>=10){
            n=n/10;
        }
        int first=n;
        System.out.println(first+last);
    }
}*/

//ques - power base question
/*class Main{
    public static void main(String args[]){
        System.out.println(power(2,5));
    }
    static int power(int x,int y){
        if(y==0) return 1;
        if(y<0) return -1;
        int half=power(x,y/2);
        if(y%2==0) return half*half;
        return half*half*x;
    }
}*/

//decimal to binary = decimaltobinary(n/2)*10+(n%2);

//ques - print all strings of bit
/*class Main{
    public static void main(String args[]){
        int n=5;//00101
        printBits(n,"");
    }

    static void printBits(int n,String ans){
        if(n==0) {
            System.out.println(ans);
            return;
        }
        printBits(n-1,ans+"0");
        printBits(n-1,ans+"1");

    }
}*/