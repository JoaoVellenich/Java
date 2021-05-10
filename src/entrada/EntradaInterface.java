package entrada;
import javax.swing.JOptionPane;

public class EntradaInterface implements IEntrada{
	public String getString(String s) {
		return JOptionPane.showInputDialog(s);						// Entrada generica de uma String com JOptionPane
	}
	
	public int getInt(String s) {
		return Integer.parseInt(JOptionPane.showInputDialog(s));	// Entrada generica de um int com o JOptionPane
	}
}
