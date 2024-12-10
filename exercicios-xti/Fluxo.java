public class Fluxo {
	public static void main (String[] args) {
		
		boolean passou = true;
		if(passou) {
			System.out.println("Contratado");
		};
		
	
		int numero = 11;
		if (numero % 2 == 0) {
			System.out.println("Número é par");
		} else {
			System.out.println("Número é ímpar");
		};
		
		
		int idade = 31;
		if(idade <= 11) {
			System.out.println("É uma criança");
		} else if (idade > 11 && idade <= 18) {
			System.out.println("Adolescente");
		} else if (idade > 18 && idade <= 60) {
			System.out.println("Adulto");
		} else {
			System.out.println("Melhor idade");
		};	
	}
}