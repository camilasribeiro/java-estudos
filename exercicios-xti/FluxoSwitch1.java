public class FluxoSwitch1 {
	public static void main (String[] args) {
		char sexo = 'M';
		
		switch(sexo) { //switch apenas compara valores 
			case 'M': //representa if
				System.out.println("Macho");
				break; // parar avaliacao do switch
			case 'F': 
				System.out.println("Femea");
				break; 
			default: // representa else
				System.out.println("Outro");
		}
	}
}