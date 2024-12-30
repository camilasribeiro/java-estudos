public class FluxoFor1{
	public static void main(String[] args) {
		String texto = "";
		for(int i = 0; i <= 20; i++) {
			if(i % 2 == 0) {
				texto += i + " ";
			}
		}
		System.out.println(texto);
	}
}