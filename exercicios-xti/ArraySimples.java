public class ArraySimples {
	
	public static void main (String[] args) {
		
		String[] uma = {"Ricardo", "Sandra"};
		//uma[0];
		//uma.length;
		
		String[][] duas = {{"Ricardo", "M", "DF"}, {"Sandra", "F", "MG"}}; //array 2 dimensões
		
		duas[1][0] = "SANDRA";
		
		System.out.println(duas[0][0]);
		System.out.println(duas[1][0]);
		System.out.println(duas.length);
		System.out.println(duas[0].length);
	}
}