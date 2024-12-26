/**
* Apresentar os conceitos de Variável
* @author Camila Ribeiro
*/

public class Variavel {
	public static void main(String[] args) {
		
		// Variável Primitiva
		int x = 7; 
		System.out.println(x);
		
		x = 9;
		System.out.println(x);
		
		
		// Variável de Referência
		String y = "XTI"; 
		System.out.println(y);
		
		y = "xti.com.br";
		System.out.println(y);
		
		y = null;
		System.out.println(y);
		
		System.out.println("Fim");
		
		
		//Constantes
		int populacaoBrasileira = 203429773;
		final double PI = 3.14159265358979323846; // se eu tentar mudar vai dar erro, pois é uma constante
		final char = SEXO_MASCULINO = "M"; // variável constante sempre em MAIUSCULA
		final char = SEXO_FEMININO = "F"; // se o nome for composto deve usar underline _
		
		
		//Wrapper
		Double preco = new Double("12.45");
		
		
		//Métodos para converter valores de Wrappers para outros tipos
		double d = preco.doubleValue();
		int i = preco.intValue();
		byte b = preco.byteValue();      

		Boolean casado = new Boolean("true");
		
		
		// conversão estática - converter sem criar um novo objeto, apenas usando métodos estáticos
		double d1 = Double.parseDouble("123.45");
		int i1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("3.14F");
		
		//converter valor binário
		int i2 = Integer.valueOf("101011", 2); //parâmetros = (valor binário, casas decimais)
		
	}
}