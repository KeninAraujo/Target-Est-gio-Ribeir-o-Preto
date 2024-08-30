package teste;
import java.util.Scanner;

public class Fibonacci {

	public boolean pertenceFibonacci(int n) {
		
		int a = 0;
		int b = 1;
		int c = a + b;
		
		while(c < n) {
			a = b;
			b = c;
			c = a + b;
		}
		
		if(c == n) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		int numero = scanner.nextInt();
		
		Fibonacci fib = new Fibonacci();
		
			if(fib.pertenceFibonacci(numero)) {
				System.out.println("O número pertence a sequência de Fibonacci");
			} else {
				System.out.println("O número não pertence a sequência de Fibonacci");
			}
	}
	
	 
}
