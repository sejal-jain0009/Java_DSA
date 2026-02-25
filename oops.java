//ques - syntax of class
/*class Student{ 
    void display(){
        System.out.println("Name is : "+name+"\nRollno. is : "+rollno);
    }
}
public class oops
{
	public static void main(String[] args) {
	    Student s1=new Student();//object creation
        s1.name="Rohit";
        s1.rollno=101;
		s1.display();
	}
}*/

//ques - Create a class Car with: brand and price and method display() Then create 2 objects.
/*class Car{
    String brand;
    double price;
    void display(){
        System.out.println("Brand is : "+brand+"\nPrice is : "+price);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Car c1=new Car();
		c1.brand="tata";
		c1.price=100.8;
		
		Car c2=new Car();
		c2.brand="gchd";
		c2.price=97749.89;
		
		c1.display();
		c2.display();
	}
}*/

//simple constructor example
/*class Student{
    String name;
    int rollno;
    
    Student(){ //this is constructor
    name="unknown";
    rollno=1519;
    }
    
    void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
}
public class oops
{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.display();
	}
}*/

//ques - example of parameterized constructor
/*class Student{
    String name;
    int rollno;
    
    Student(String n,int r){ //this is constructor
    name=n;
    rollno=r;
    }
    
    void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
}
public class oops
{
	public static void main(String[] args) {
		Student s1=new Student("unknown",1519);
		s1.display();
	}
}*/

//ques - constructor overloading 
/*class Student{
    String name;
    int rollno;
    
    Student(){
        name="sejal";
        rollno=3424;
    }
    Student(String n,int r){ //this is constructor
    name=n;
    rollno=r;
    }
    
    void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
}
public class oops
{
	public static void main(String[] args) {
	    Student s1=new Student();
	    s1.display();
		Student s2=new Student("unknown",1519);
		s2.display();
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

//question -Create: Class Animal,Class Dog extends Animal and Add methods and test inheritance
/* 
   class Animal{ //parent class
    void Eat()
    {
        System.out.println("Animal is eating");
    }
    
    void drink(){
        System.out.println("Animal is drinking");
    }
}

class Dog extends Animal{//child class
    void bark(){
        System.out.println("Dog is barking");
    }
}

class testQuestions
{
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.Eat();//d1 calls parent class 
		d1.drink();
		
		d1.bark();//calls child class
	}
}*/

//question - Create class Vehicle with method start() and Create subclass Car that overrides it.
/* 
   class Vehicle{ //parent class
    void start()
    {
        System.out.println("Vechile is going to start");
    }
}

class Car extends Vehicle{ //child class
    @Override //means method and parameter same hai je othe start c ethe v hou te j ohde ch koi parameter na pass hoia ethe v ni hona
    void start(){
        System.out.println("Car is going to start");
    }
}

class testQuestions
{
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.start();
		
		Car c=new Car();
		c.start();
    }
}*/

//question - Use runtime polymorphism with Animal and Cat
/* 
   class Animal{ //parent class
    void display()
    {
        System.out.println("animal is displayed");
    }
}

class Cat extends Animal{ //child class
    @Override 
    void display(){
        System.out.println("cat is displayed");
    }
}

class testQuestions
{
	public static void main(String[] args) {
		Animal a=new Cat(); //tn ehde ch display function cat ala call houga
		a.display();
	}
}
*/

//question - Create parent class Person and child class Student and Use super to call parent constructor.

  /* class parent{ //parent class
   String name;
   parent(String name){
       this.name=name;
       System.out.println("call for parent class");
   }
}

class child extends parent{ //child class
    int roll;
    child(String name,int roll){
        super(name);
        this.roll=roll;
        System.out.println("call for child class");
    }
    
    void display(){
        System.out.println("name is : "+name);
        System.out.println("roll is :"+roll);
    }
}

class testQuestions
{
	public static void main(String[] args) {
	    child c = new child("sejal",1519);//phla parent nu call fir child fir display function
	    //c.display();- agr ehnu print na kraiye then call for parent and child class hi print houga 
	}
}
*/

//ques - Create a class with:final variable,final method and Show that overriding is not allowed
/*
class Parent {
    final int x = 10;   // final variable

    final void show() {   // final method
        System.out.println("This is a final method.");
    }
}

// Child Class
class Child extends Parent {

    // ❌ This will give error (Cannot override final method)
    
    //void show() {
    //    System.out.println("Trying to override");
    //}

    void display() {
        // x = 20;  ❌ Error (Cannot change final variable)
        System.out.println("Value of x: " + x);
    }
}

class testQuestions {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.display();
    }
}
*/

//ques - Create: Class A then Class B extends then Class C extends B and Call methods from all levels.
/*class A {
    void m1(){
        System.out.println("this is method of A");
    }
}

class B extends A{
    void m2(){
        System.out.println("this is method of B");
    }
} 

class C extends B{
    void m3(){
        System.out.println("this is method of C");
    }
}

public class Main {
    public static void main(String[] args) {
        C c1=new C();
        c1.m1();
        c1.m2();
        c1.m3();
    }
}

// Parent Class
class Shape {
    void area() {
        System.out.println("Area method of Shape");
    }
}

// Child Class 1
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}*/

//ques - Create:Class Shape with method area() and Subclasses Circle and Rectangle, Use runtime polymorphism
// Child Class 2
/*class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

class testQuestions {
    public static void main(String[] args) {

        // Runtime Polymorphism
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        s1.area();   // Calls Circle's area()
        s2.area();   // Calls Rectangle's area()
    }
}*/
