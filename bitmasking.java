//ques - to check even odd using bitmasking
/*class Main
{
	public static void main(String[] args) {
		int n1=7;
		int n2=8;
		if((n2 & 1)==1) System.out.println("Odd");
		else System.out.println("Even");
	}
}*/

//ques- implemention of operations of bit masking
/*class Main
{
	public static void main(String[] args) {
		int n1=5;
		int n2=3;
		System.out.println(5 & 3); //And operation
		System.out.println(5 | 3); //or operation
		System.out.println(5 ^ 3); //Xor operation
		System.out.println(~5); //Not operation
		System.out.println(5<<1); //left - multiply by 2
		System.out.println(5>>1);//right - divide by 2
	}
}*/

//ques - applications of bitmasking
//check ith bit
/*public class Main
{
	public static void main(String[] args) {
		int n=5; //0101
		int i=3;
		if((n &(1<<i))!=0) System.out.println("Bit is On");
		else System.out.println("Bit is off");
		
	}
}*/

//Set ith bit
/*class Main
{
	public static void main(String[] args) {
		int n=5; //0101
		int i=1;
		n=n|(1<<i);//0111
		System.out.println(n);
	}
}*/

//Clear ith bit
/*class Main
{
	public static void main(String[] args) {
		int n=5; //0101
		int i=2;
		n=n& ~(1<<i);//0001
		System.out.println(n);
	}
}*/