package teste;
import java.util.Scanner;

public class Verifica {
	
	public int verificaString(String string) {
		int counter = 0;
	
		String text = string.toLowerCase();
		
		
		
			for(int i = 0; i < text.length(); i++) {
				if(text.charAt(i) == 'a') {
					counter++;
				}
			}
	
		return counter;
		
	
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Verifica veri = new Verifica();
		
		String string = scanner.nextLine();
		
		System.out.println(veri.verificaString(string));
		
	}

}
