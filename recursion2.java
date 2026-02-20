//ques - skip all the a's from string
/*import java.util.*;
class recursion2 {
    public static void main(String[] args) {
        skip(" ","baccad");
    }
    public static void skip(String empty,String Original){ 
        if(Original.isEmpty()) {
            System.out.println(empty);
            return;
        } //agr empty hai toh print krk return 
        
        char ch=Original.charAt(0); //first character liya
        
        if(ch=='a') skip(empty,Original.substring(1));//pehle check kiya agr equal h toh empty hi rhegi aur original update
        else skip(empty+ch,Original.substring(1)); //else both update
    }
}*/

//ques - skip all the a using 1 arugument
/*import java.util.*;
class recursion2 {
    public static void main(String[] args) {
        System.out.println(skip("baccad"));
    }
    public static String skip(String Original){ 
        if(Original.isEmpty()) {
            return "";
        } //agr empty hai return 
        
        char ch=Original.charAt(0); //first character liya
        
        if(ch=='a') return skip(Original.substring(1));//pehle check kiya agr equal h toh empty hi rhegi aur original update
        else return ch + skip(Original.substring(1)); //else both update
    }
}*/

///ques: skip 'apple' from string
/*import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println(skipApple("bdapplefg"));
    }
    public static String skipApple(String Original)
    {
        if(Original.isEmpty()) return "";
        
        char ch=Original.charAt(0);
        if(Original.startsWith("apple")) return skipApple(Original.substring(5));
        else return ch+skipApple(Original.substring(1));
     }
}*/

//ques - skip app but not apple from string
/*import java.util.*;
class Main{
    public static void main(String args[]){
        System.out.println(skipAppNotApple("bdapplefgapp"));
        System.out.println(skipAppNotApple("bcdappdee"));
    }
    public static String skipAppNotApple(String Original){
        if(Original.isEmpty()) return "";
        char ch=Original.charAt(0);
        if(Original.startsWith("app") && !Original.startsWith("apple")) {
            return skipAppNotApple(Original.substring(3));
        }
        else return ch+skipAppNotApple(Original.substring(1));
    }
}*/

//ques - find subset of string
/*import java.util.*;
public class Main
{
	public static void main(String[] args) {
		subseq("","abc");
	}
	
	public static void subseq(String subset,String Original)
	{
	    if(Original.isEmpty()){
	        System.out.println(subset);
	        return;
	    }
	    
	    char ch=Original.charAt(0);
	    subseq(subset+ch,Original.substring(1));//ehde ch add kr re a te Original update kr re a
	    subseq(subset,Original.substring(1));//ehde ch ignore kr re a te orignal update
	}
}*/

//ques - find subset of string using arrayList
/*import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println((subseqlist("","abc")));
	}
	
	public static ArrayList<String> subseqlist(String subset,String Original)
	{
	    if(Original.isEmpty()){
	        ArrayList<String> list=new ArrayList<>();
	        list.add(subset);
	        return list;
	    }
	    
	    char ch=Original.charAt(0);
	    ArrayList<String> left = subseqlist(subset+ch,Original.substring(1));//ehde ch add kr re a te Original update kr re a
	    ArrayList<String> right= subseqlist(subset,Original.substring(1));//ehde ch ignore kr re a te orignal update
	    
	    left.addAll(right);
	    return left;
	}
}*/

//ques  - to find asii value of a character
import java.util.*;
class Main{
    public static void main(String[] args){
        char ch = 'a';
        System.out.println(ch+0);
    }
}