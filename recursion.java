//part 1
//ques 1 : print 1 to 4
/*class recursion{ {
    public static void main(String[] args) {
        printN(1);
    }
    
    public static void printN(int n)
    {
        if(n==5) return;
        System.out.println(n);
        printN(n+1);
    }
}*/

//ques 2 : fibonacci number
/*class recursion{
    public static void main(String args[]){
        System.out.print(fibo(6));
    }
    public static int fibo(int n)
    {
        if(n==0 || n==1) return n;
        return fibo(n-1)+fibo(n-2);
    }
}*/

//ques3: binary search using recursion
/*class Main {
    public static void main(String[] args) {
       int[] arr={1,2,4,66,77,8,99,57,43};
       int target=66;
       System.out.println(binarySearch(arr,target,0,arr.length-1));
    }
    
    public static int binarySearch(int[] arr,int target,int start,int end)
    {
        if(start>end) return -1;
        int mid=start+(end-start)/2;
        if(arr[mid]==target) return mid;
        if(arr[mid]>target) return binarySearch(arr,target,start,mid-1);
        else  return binarySearch(arr,target,mid+1,end);
    }
}*/

//part 2
//ques4: print from n to 1
/*class Main {
    public static void main(String[] args) {
       Nto1(5);
    }
    
    public static void Nto1(int n)
    {
        if(n==0) return;
        System.out.println(n);
        Nto1(n-1);
    }
}*/

//ques5:factorial of number
/*class Main {
    public static void main(String[] args) {
       System.out.print(factorial(8));
    }
    
    public static int factorial(int n)
    {
        if(n==0) return 1;
        return n*factorial(n-1);
    }
}*/

//ques6:sum of n number
/*class Main {
    public static void main(String[] args) {
       System.out.print(sum(5));
    }
    
    public static int sum(int n)
    {
        if(n==0) return 0;
        return n+sum(n-1);
    }
}*/

//ques7:sum of digits
/*class Main {
    public static void main(String[] args) {
       System.out.println(digitsum(1342));
    }
    
    public static int digitsum(int n)
    {
        if(n==0) return 0;
        return (n%10)+digitsum(n/10);
    }
}*/

//ques 8:product of all digits
/*class Main{
    public static void main(String args[])
    {
        System.out.println(digitpro(1342));
    }
    
    public static int digitpro(int n)
    {
        if(n%10==n) return n;//agr end mein single digit hai sirf n toh bs whi return ho jaye aur multiply hojaye
        return digitpro(n/10)*(n%10);
    }
}*/

//ques 9:Concept of --n
/*class Main{
    public static void main(String args[])
    {
        printn(6);
    }
    
    public static void printn(int n)
    {
        if(n==0) return;
        System.out.println(n);
        printn(n--);// will print 6 infinte times
       // printn(--n); will print 6 5 4 3 2 1
    }
}*/

//ques 10: a.) reverse a number - method 1
/*class Main{
    public static void main(String args[])
    {
        printn(1324);
       System.out.print(sum);
    }
    
    static int sum=0;
    public static void printn(int n)
    {
        if(n==0) return;
        int rem=n%10;
        sum=sum*10+rem;
        printn(n/10);
    }
}*/

//b.) reverse - 2nd method
/*class Main {
    static int sum=0;
    public static int reverse(int n){
        //Sometimes you might need some different variables in the arguments in that case, make another function
    int digits=(int)(Math.log10(n))+1;//to find no. of digits in a no.
        return helper(n,digits);
    }
    
    public static int helper(int n,int digits)
    {
        if(n%10==n) return n;//means if it is a single digit number
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }
    
    public static void main(String[] args) {
        System.out.print(reverse(1234));
    }
}*/

//ques 11 . palindrome of a number
/*class Main {
    static int sum=0;
    public static int reverse(int n){
        //Sometimes you might need some different variables in the arguments in that case, make another function
    int digits=(int)(Math.log10(n))+1;//to find no. of digits in a no.
        return helper(n,digits);
    }
    
    public static int helper(int n,int digits)
    {
        if(n%10==n) return n;//means if it is a single digit number
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }
    
    public static boolean palin(int n)
    {
        return n==reverse(n);
    }
    
    public static void main(String[] args) {
        System.out.print(palin(1234321));
    }
}*/

//ques 12 . count no. of zeroes in a number
/*class Main {
    public static int countzeroes(int n)
    {
        return helper(n,0);
    }
    
    //special pattern, how to pass value to other calls
    public static int helper(int n,int c)
    {
        if(n==0) return c;
        int rem=n%10;
        if(rem==0)
        {
            return helper(n/10,c+1);
        }
        else{
            return helper(n/10,c);
        }
    }
    
    public static void main(String[] args) {
        System.out.print(countzeroes(302040));
    }
}*/

//part 3 - recursion on arrays
//ques 13. check if given array is sorted or not
/*class Main {
    public static boolean sorted(int arr[],int index)
    {
        if(index==arr.length-1) return true;
        return (arr[index]<arr[index+1]) && sorted(arr,index+1);
    }
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,8,6,7};
        System.out.print(sorted(arr,0));
    }
}*/

//ques 14. linear search
/*class Main {
    public static boolean search(int arr[],int target,int index)
    {
        if(index==arr.length) return false;
        return (arr[index]==target) || search(arr,target,index+1);
    }
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,8,6,7};
        System.out.print(search(arr,8,0));
    }
}*/

//ques 15. finding index
/*class Main {
    public static int findindex(int arr[],int target,int index)
    {
        if(index==arr.length) return -1;
        if(arr[index]==target) return index;
        return (findindex(arr,target,index+1));
    }
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,8,6,7};
        System.out.print(findindex(arr,7,0));
    }
}*/

//ques 16. finding index from last
/*class Main {
    public static int findindex(int arr[],int target,int index)
    {
        if(index<0) return -1;
        if(arr[index]==target) return index;
        return (findindex(arr,target,index-1));
    }
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,8,6,7};
        System.out.print(findindex(arr,7,arr.length-1));
    }
}*/

//ques 17. linear search using arraylist
/*import java.util.*;
class Main {
    public static void main(String[] args) {
       int[] arr={1,4,6,7,4,8,4};
       lastIndex(arr,4,arr.length-1);
       System.out.print(list);
    }
    
    static ArrayList<Integer> list = new ArrayList<>();
    static void lastIndex(int[] arr, int target,int index)
    {
        if(index<0) return;
        if(arr[index]==target) list.add(index);
        lastIndex(arr,target,index-1);
    }
}*/

//ques 18 : add all elements in arrayList
/*import java.util.*;
class Main {
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list)
    {
        if(index==arr.length) return list;
        if(arr[index]==target) list.add(index);
        return findAllIndex(arr,target,index+1,list);
    }
    
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,4,6,7,4,8};
       System.out.println(findAllIndex(arr,4,0,new ArrayList<>()));
    }
}*/

//ques 20 : print all permutations of a string
/*import java.util.*;
class Main {
    public static void permutation(String s, String combination) {
        if (s.length() == 0) {
            System.out.println(combination);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String temp = s.substring(0, i) + s.substring(i + 1);
            permutation(temp, combination + ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        permutation(s, "");
    }
}*/

//ques 21 : print Inverted triangle
/*class Main {
    public static void main(String[] args) {
        triangle(5,0);
    }
    public static void triangle(int row,int col)
    {
        if(row==0) return;
        if(row>col)
        {
            System.out.print("*");
            triangle(row,col+1);
        }
        else{
            System.out.println();
            triangle(row-1,0);
        }
    }
}*/

/*import java.util.*;
public class recursion {
    public static void swap(StringBuilder sb,int start,int i){
        char temp=sb.charAt(start);
        sb.setCharAt(start, sb.charAt(i));
        sb.setCharAt(i, temp);
    }
public static void backTrackingPermutation(StringBuilder sb,int start)
{
    if(start==sb.length()-1) {
        System.out.println(sb);
        return;
    }
    for(int i=start;i<sb.length();i++)
    {
        swap(sb,start,i);
        backTrackingPermutation(sb,start+1);
        swap(sb,start,i); // backtrack
    }
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        backTrackingPermutation(new StringBuilder(s),0);
        sc.close();
    }
    
}*/

//ques 22 : triangle
/*class Main {
    public static void main(String[] args) {
        triangle(5,0);
    }
    public static void triangle(int row,int col)
    {
        if(row==0) return;
        if(row>col)
        {
            triangle(row,col+1);
            System.out.print("*");  
        }
        else{
            triangle(row-1,0);
            System.out.println();
        }
    }
}*/