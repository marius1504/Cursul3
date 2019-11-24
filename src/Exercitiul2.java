import java.util.Scanner;

public class Exercitiul2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti primul string:");
		String str1 = sc.next();
		sc.nextLine();
		System.out.println("Introduceti al doilea string");
		String str2 = sc.next();
		System.out.println(anagramSolver(str1, str2));
		sc.close();
	}
	
	public static boolean anagramSolver(String anag1, String anag2) {
		anag1 = anag1.replaceAll("\\s", "");
		anag2 = anag1.replaceAll("\\s", "");
		if(anag1.length() != anag2.length()){
		    return false;
		}
		char[] anag1Letters = anag1.toCharArray();
		char[] anag2Letters = anag2.toCharArray();
		int anag1Value = 0;
		int anag2Value = 0;

		for(int i =0; i < anag1Letters.length; i++){
		    anag1Value+= anag1Letters[i];
		    anag2Value+= anag2Letters[i];
		}
		if(anag1Value != anag2Value){
		    return false;
		}
		return true;
	}

}
