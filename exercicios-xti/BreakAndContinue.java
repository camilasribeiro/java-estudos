public class BreakAndContinue{
	public static void main(String[] args){
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				break; // Break encerra o fluxo inteiro
				//continue; // Continue encerra apenas o fluxo atual
			}
			System.out.println(i);
		}
	}
}