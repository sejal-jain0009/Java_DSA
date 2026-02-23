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

//question - Create a class Employee with: name,salary,static variable company -All employees belong to same companys 
/*    class Employee{
    String name;
    int salary;
    static String company ="Apple";//common for all
    
    Employee(String name,int salary)
    {
        this.name=name;
        this.salary=salary;
    }
    
    void display()
    {
        System.out.println("Name is : "+name);
        System.out.println("Rollno. is : "+salary);
        System.out.println("Company is : "+company);
        System.out.println("----------------------------");
    }
}
class testQuestions
{
	public static void main(String[] args) {
		Employee e1=new Employee("sejal",50000);
		e1.display();
		
		Employee e2=new Employee("srishti",60000);
		e2.display();
	}
}*/

//question -Create a class Rectangle: Constructor with no parameters, Constructor with length & breadth, Method area()
 /*  class Rectangle{
    int l;
    int b;
    
    Rectangle()
    {
        l=2;
        b=4;
    }
    
    Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    void Area()
    {
        System.out.println(l*b);
    }
}
class testQuestions
{
	public static void main(String[] args) {
		Rectangle e1=new Rectangle();
		e1.Area();
		
		Rectangle e2=new Rectangle(8,9);
		e2.Area();
	}
}*/