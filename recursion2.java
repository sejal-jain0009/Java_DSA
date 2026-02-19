//ques - skip all the a's from string
/*import java.util.*;
class recursion2 {
    public static void main(String[] args) {
        skip(" ","baccad");
    }
    public static void skip(String empty,String Original){ //j ethe void d jgah string laiye sb jgah string return krni pau te main ch sout hoju
        if(Original.isEmpty()) {
            System.out.println(empty);
            return;
        } //agr empty hai toh print krk return 
        
        char ch=Original.charAt(0); //first character liya
        
        if(ch=='a') skip(empty,Original.substring(1));//pehle check kiya agr equal h toh empty hi rhegi aur original update
        else skip(empty+ch,Original.substring(1)); //else both update
    }
}*/


