import java.util.ArrayList;
import java.util.Scanner;
public class ListaDeProdutos{
	public static void main(String[] args) {
		ArrayList<String> produtos = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Liste seus produtos : Para sair digite FIM");
		
		String produto;
		
		while(!"FIM".equals(produto = scanner.nextLine())) {
			produtos.add(produto);
		}
		System.out.println(produtos.toString());
	}
} 