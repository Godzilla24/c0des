import java.util.*;
public class Activity2 {
    
    public static void main(String[] args) {
    	
    Scanner input = new Scanner(System.in);
    	
    	System.out.println("Insert name: ");
    	String name = input.nextLine();
    	System.out.println("Insert course: ");
    	String course = input.nextLine();
    	System.out.println("Insert section: ");
    	String section = input.nextLine();
    	System.out.println("Insert address: ");
    	String address = input.nextLine();
    	System.out.println("Insert contact number: ");
    	String contactnum = input.nextLine();
    	
    	System.out.println(" ");
    	
    	System.out.println("Hello, my name is " + name);
    	System.out.println("I'm currently studying with the course of " + course + "with the section " + section);
    	System.out.println("and I live at " + address);
    	System.out.println("you can contact me with this number " + contactnum);
    }
}
