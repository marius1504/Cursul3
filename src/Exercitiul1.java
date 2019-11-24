import java.util.Scanner;
public class Exercitiul1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Introduceti propozitia:");
		String str = sc.nextLine();
		printCharWithMaxFrequency(str);
		printCharWithMinFrequency(str);
		sc.close();
		
	}
	
	public static void printCharWithMaxFrequency(String s) {
		s = s.toLowerCase();
		int maxFreq = 0;
		for (int i=0; i<s.length(); i++) {
			if (Character.isWhitespace(s.charAt(i))) {
				continue;
		    }
		 
		    int charFreq = 1;
		    	for (int j=i+1; j<s.length(); j++) {
		    		if (s.charAt(i) == s.charAt(j)) {
		    			charFreq++;
		    		}
		    	}
		    maxFreq = charFreq > maxFreq ? charFreq : maxFreq;
		}
		 
		for (int i=0; i<s.length(); i++) {
			if (Character.isWhitespace(s.charAt(i))) {
				continue;
		    }
		    int charFreq = 1;
		    	for (int j=i+1; j<s.length(); j++) {
		    		if (s.charAt(i) == s.charAt(j)) {
		    			charFreq++;
		    		}
		    	}
		    if (charFreq == maxFreq) {
		    	System.out.println("Character '" + s.charAt(i) + 
		                          "' appears " + maxFreq + " times.");
		    }
		}
	}
	
	public static void printCharWithMinFrequency(String s) {
		s = s.toLowerCase();
		int minFreq = Integer.MAX_VALUE;
		for (int i=0; i<s.length(); i++) {
			if (Character.isWhitespace(s.charAt(i))) {
				continue;
		    }
		 
		    int charFreq = 1;
		    	for (int j=i+1; j<s.length(); j++) {
		    		if (s.charAt(i) == s.charAt(j)) {
		    			charFreq++;
		    		}
		    	}
		    minFreq = charFreq < minFreq ? charFreq : minFreq;
		}
		 
		for (int i=0; i<s.length(); i++) {
			if (Character.isWhitespace(s.charAt(i))) {
				continue;
		    }
		    int charFreq = 1;
		    	for (int j=i+1; j<s.length(); j++) {
		    		if (s.charAt(i) == s.charAt(j)) {
		    			charFreq++;
		    		}
		    	}
		    if (charFreq == minFreq) {
		    	System.out.println("Character '" + s.charAt(i) + 
		                          "' appears " + minFreq + " times.");
		    }
		}
	}
}
