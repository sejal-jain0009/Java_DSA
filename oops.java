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

