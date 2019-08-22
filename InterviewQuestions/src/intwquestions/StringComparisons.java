package intwquestions;

public class StringComparisons {
	public static void main(String[] args) 
    { 
		 // Get some Strings to compare 
        String s1 = "A"; 
        String s2 = "A"; 
        String s3 = "a"; 
        String s4 = new String("A"); 
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        
        // equals
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        
        // equalsignore case
        
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));
        
        // compareTo - compares unicode values of 2 strings and returns 
        
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
    }
}
