import java.util.Arrays;
import java.util.Scanner;
public class Exercitiul4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti numarul de cuvinte:");
		int n = sc.nextInt();
		String [] words = new String[n];
		for (int i=0; i < words.length; i++) {
			System.out.println("Introduceti cuvantul " + (i + 1) + ":");
			words[i] = sc.next();
		}
		System.out.println("Introduceti cuvantul cheie:");
		String keyWord = sc.next();
		System.out.println("Introduceti numarul de litere comune:");
		int number = sc.nextInt();
		System.out.println("Cuvintele care corespund criteriului de filtrare sunt: ");
		String [] result = filter(words, keyWord, number);
		for (int i=0; i <result.length; i++) {
			System.out.println(result[i]);
		}
		sc.close();
	}

	public static String[] filter(String[] words, String key, int n) {
		String[] filteredWords = new String[words.length];
		int size = 0;
		key = key.toLowerCase();
		for (int i=0; i<words.length; i++) {
			String crtWord = words[i].toLowerCase();
		    int minLength = Math.min(crtWord.length(), key.length());
		    int countMatches = 0;
		    for (int j=0; j<minLength; j++) {
		    	if (crtWord.charAt(j) == key.charAt(j)) {
		    		countMatches++;
		    	}
		    }
		    if (countMatches >= n) {
		    	filteredWords[size] = words[i]; 
		    	size++;
		    }
		}
		  return Arrays.copyOf(filteredWords, size);
	}
}
