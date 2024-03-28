package Alpha_tech_task;
import java.util.Scanner;

public class CCCC {
    public static String remove(String input) {
    	
        return input.replaceFirst("^0+(?!$)", "");
    	
        
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Your Number String = ");
    	String input = sc.nextLine();
        String output = remove(input);
        System.out.println("Input : " + input);
        System.out.println("Output: " + output);
        sc.close();
    }
}



