import java.util.Random; 

public class Baralho {
	public static void main (String[] args){
		
		String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
		String[] nipes = {"Espadas", "Paus", "Copas", "Ouros"};
		
		Random r = new Random();
		int indiceFace = r.nextInt(faces.length); //passando o número máximo que ele pode escolher aleatóriamente
		String face = faces[indiceFace];
		
		int indiceNipe = r.nextInt(nipes.length); //passando o número máximo que ele pode escolher aleatóriamente
		String nipe = nipes[indiceNipe];
		
		String carta = face + " " + nipe;
		System.out.println(carta);
		
	}
}