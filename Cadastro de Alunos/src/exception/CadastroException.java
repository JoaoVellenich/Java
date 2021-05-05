package exception;

import armazenador.IArmazenador;
import armazenador.VetDin;

public class CadastroException extends IllegalArgumentException {
	
	private static final long serialVersionUID = 1L;
	IArmazenador IA_LOG = new VetDin();	
	
	CadastroException(){
		super("Exception");
	}
	
	public void entradaException() {
		IA_LOG.inserir("Entrada Invalida");
	}
}

