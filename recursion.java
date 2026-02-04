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