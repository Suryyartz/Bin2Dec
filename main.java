import java.util.*;

public class main {
    public static void main(String[] args) {
    	
    	Scanner scanner= new Scanner (System.in);
    	
    	
    	String b;
    	int d=0;
    	boolean valid = true;
    	
    	System.out.print("Enter your Binary number: ");
    	b = scanner.next();
    	
    	
    	if(b.length()>8) {
    	System.out.print("Your number must be up to 8 binary digits.");
    	valid = false;
    	
    	}
    	else {
    	
    		for (int i = 0; i < b.length(); i++) {
    			char c=b.charAt(i);
    			if (c != '0' && c != '1' ) {
    	            System.out.println("Your number must contain only 0s and 1s.");
    	            valid = false;
    	            break;
    			}
    		}
    	}
    	
    	if(valid) {
    		for (int i = 0; i < b.length(); i++) {
    			char c=b.charAt(i);
    			if (c=='1') {
    			int p= b.length()-1-i;
    			d+= Math.pow(2,p);
    			}
    		}
    		System.out.print(d);
    	}

    	scanner.close();
    }
}
