public class PhraseOMatic {
	public static void main (String[] args) {
		
		// crie três conjuntos de palavras onde será feita a seleção
		String[] wordListOne = {"24/7", "várias camadas", "30.000 pés", "B-to-B", "todos ganham", "front-end", "baseado na Web", "difundido", "inteligente", "seis sigma", "caminho crítico", "dinâmico"};
		
		String[] wordListTwo = {"habilitado", "adesivo", "valor agregado", "orientado", "central", "distribuído", "agrupado", "solidificado", "independente da máquina", "posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado", "compartilhado", "cooperativo", "acelerado"};
		
		String[] wordListThree = {"processo", "ponto máximo", "solução", "arquitetura", "habilitação no núcleo", "estratégia", "mindshare", "portal", "espaço", "visão", "paradigma", "missão"};
		
		// descubra quantas palavras existem em cada lista
		int oneLength = wordListOne.length;
		System.out.println(oneLength);
		int twoLength = wordListTwo.length;
		System.out.println(twoLength);
		int threeLength = wordListThree.length;
		System.out.println(threeLength);
		
		// gere três números aleatórios
		int rand1 = (int) (Math.random() * oneLength);
		System.out.println(rand1);
		int rand2 = (int) (Math.random() * twoLength);
		System.out.println(rand2);
		int rand3 = (int) (Math.random() * threeLength);
		System.out.println(rand3);
		
		// agora construa uma frase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		// exiba a frase
		System.out.println("Precisamos de " + phrase);
	}
}