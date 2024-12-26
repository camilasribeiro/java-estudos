import java.util.Scanner;

public class PropriedadesDoCirculo {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o Raio:");
		double raio = s.nextDouble();
		
		//Diâmetro : 2r
		double diametro = 2 * raio;
		System.out.println("Diâmetro: " + diametro);
		
		//Circunferência : 2 PI r 
		double pi = Math.PI;
		double circunferencia = 2 * pi * raio;
		System.out.println("Circunferência: " + circunferencia);
		
		//Área do Círculo = Pi r2
		double area = pi * (raio * raio);
		System.out.println("Área do círculo: " + area);
	}
}