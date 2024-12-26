import javax.swing.JOptionPane; //nessa biblioteca tem itens de interface 
public class Entrada {
	
	public static void main(String [] args) {
		
		String nome = JOptionPane.showInputDialog("Qual é o seu nome?"); //retorna um objeto do tipo string
		JOptionPane.showMessageDialog(null, nome);
	}
}