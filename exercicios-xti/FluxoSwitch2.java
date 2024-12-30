public class FluxoSwitch2 {
	public static void main(String[] args) {
		String tecnologia = "java";
		
		switch(tecnologia){
			case "java":
			case "c++":
			case "cobol":
				System.out.println("Linguagem de Programação");
				break;
			case "oracle":
			case "sqlserver":
			case "postgresql":
				System.out.println("Banco de Dados");
				break;
			default:
				System.out.println("Tecnologia Desconhecida");
		}	
		
	}

}