public class MyFirstApp {
	public static void main (String[] args) {
		System.out.println("I Rule!");
		System.out.println("The World");
		
		
		//fazer algo
		int x = 3;
		String name = "Dirk";
		x = x * 17;
		System.out.println("x is " + x);
		double d = Math.random();
		
		
		//fazer algo repetidamente
		//loops: for e while
		while (x > 12) {
			x = x - 1;
			System.out.println("x: " + x);
		}
		
		for (x = 0; x < 10; x = x + 1) {
			System.out.println("x is now " + x);
		}
		
		
		//fazer algo sob essa condicao
		//ramificação: testes if/else
			
		if (x == 10) {
			System.out.println("x must be 10");
		} else {
			System.out.println("x isn't 10");
		}
		if ((x < 3) & (name.equals("Dirk"))) {
			System.out.println("Gently");
		}
		System.out.println("this line runs no matter what");
	}
}