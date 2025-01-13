public class DesafioFibonacci{
	public static void main(String[] args) {
		int anterior = 0;
		int proximo = 1;
		System.out.println(anterior);
		
		while (proximo < 3000) {
			System.out.println(proximo);
			proximo = proximo + anterior; 
			anterior = proximo - anterior;
		}
	}
}