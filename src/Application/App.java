package Application;

import armazenador.IArmazenador;
import armazenador.VetDin;
import entrada.Menu;
import log.LOG;
import pessoa.Aluno;

public class App{
    public static void main(String args[]){

    	IArmazenador IA = new VetDin();
    	LOG log = new LOG();
    	Menu menu = new Menu();
    	
		int op = 0;
    	
        // Instancia de Cadastro (criando objeto)
		Cadastro cadAlunos = new Cadastro(); 
		
		cadAlunos.recuperarDados();
		
		//loop que implementa o MENU
        while(op != 5) {
        	//Try Catch, para pegar execoes durante o menu
        	try {
        		op = menu.menuCad();			// Mostra o Menu, e coleta a opção
            	switch(op) {					// Switch das opçoes do menu
            	case 1:
            		Aluno a = menu.cadastrarAluno();
            		cadAlunos.inserir(a);		// Inserir Aluno
            		IA.inserir("Selecionou a OP 1 - INSERIR");
            		IA.inserir("Inseriu o aluno: "+a.getNome() + "|"+a.getRa()+"|"+a.getIdade());
            		break;
            	case 2:
                	cadAlunos.removerAluno();	// Remover Aluno
                	IA.inserir("Selecionou a OP 2 - REMOVER");
            		break;
            	case 3:
                	cadAlunos.listarAlunos();	// Listar Aluno
                	IA.inserir("Selecionou a OP 3 - LISTAR");
            		break;
            	case 4:
            		cadAlunos.salvarDados();		// Sair do menu
            		IA.inserir("Selecionou a OP 4 - SALVAR");
            		break;
				case 5:
            		menu.MSG("Saindo");		// Sair do menu
            		IA.inserir("Selecionou a OP 5 - SAIR");
            		break;
            	default:
            		menu.MSG("Valor Invalido");	// caso o valor de opção diferente de 1 até 5
            		IA.inserir("valor digitado fora da base");
            		break;
            	}
			}catch(Exception e) {
				cadAlunos.cancelBot();// Caso ache uma Exceção
				IA.inserir("Botao de cancelar clicado");
			}
        	log.saveLOG(IA);
        }
    }
}
