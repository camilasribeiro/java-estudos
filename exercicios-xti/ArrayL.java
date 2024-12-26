import java.util.ArrayList; 

public class ArrayL {
	public static void main (String[] args){
		
		ArrayList<String> cores = new ArrayList<>(); //ArrayList precisa especificar o tipo de dados
		cores.add("Branco");
		cores.add("Rosa");
		cores.add("Preto");
		cores.add(0, "Azul"); //escolho a posição que quero colocar aquela cor
		
		System.out.println(cores.toString()); //toString retorna representação em texto do ArrayList
		System.out.println("Tamanho: " + cores.size()); //método size
		System.out.println("Elemento2: " + cores.get(2)); //recuperar elemento dentro do ArrayList
		System.out.println("Índice da cor Rosa: " + cores.indexOf("Rosa")); // método indexOf para descobrir o índice de um elemento
		
		
		// método para remover um elemento do ArrayList
		cores.remove("Azul");
		System.out.println("Cor Azul removida: " + cores.toString());
		
		// método para verificar se um elemento existe no ArrayList
		System.out.println("Tem a cor Azul? " + cores.contains("Azul"));
		System.out.println("Tem a cor Preto? " + cores.contains("Preto"));
	}
}