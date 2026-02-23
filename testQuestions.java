//import java.util.*;
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
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-1)+fib(n-2);
    }
}*/

//question - Create a Student class with: name, rollNo,Constructor, Method display() ,Create 2 objects and print their details.
/*class Student{
    String name;
    int rollno;
    
    Student(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }
    
    void display()
    {
        System.out.println("Name is : "+name);
        System.out.println("Rollno. is : "+rollno);
        System.out.println("----------------------------");
    }
}
class testQuestions
{
	public static void main(String[] args) {
		Student s1=new Student("sejal",1519);
		s1.display();
		
		Student s2=new Student("srishti",1542);
		s2.display();
	}
}*/

