import java.util.Random;
import java.util.Scanner;

public class JogoDeDados{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual é o seu palpite? ");
		int palpite = scanner.nextInt();
		
		Random r = new Random();
		int dado = r.nextInt(6)+1; 
		
		System.out.println("Seu palpite: " + palpite);
		System.out.println("Valor do dado: " + dado);
		
		if(palpite == dado) {
			System.out.println("Seu palpite está correto");
		} else {
			System.out.println("Seu palpite está errado");
		}
	}
}
