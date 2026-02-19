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




