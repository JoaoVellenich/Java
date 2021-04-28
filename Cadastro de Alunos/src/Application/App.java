package Application;

import entrada.Menu;

public class App{
    public static void main(String args[]){
    	// Instancia do menu
    	Menu menu = new Menu();
		
    	//inicializa a opcao com 0
		int op = 0;
    	
        // Instancia de Cadastro (criando objeto)
		Cadastro cadAlunos = new Cadastro(); 
		
		//loop que implementa o MENU
        while(op != 5) {
        	//Try Catch, para pegar execoes durante o menu
        	try {
        		op = menu.menuCad();			// Mostra o Menu, e coleta a opção
            	switch(op) {					// Switch das opçoes do menu
            	case 1:
            		cadAlunos.inserir();		// Inserir Aluno
            		break;
            	case 2:
                	cadAlunos.removerAluno();	// Remover Aluno
            		break;
            	case 3:
                	cadAlunos.listarAlunos();	// Listar Aluno
            		break;
            	case 4:
            		cadAlunos.salvarDados();		// Sair do menu
            		break;
				case 5:
            		menu.MSG("Saindo");		// Sair do menu
            		break;
            	default:
            		menu.MSG("Valor Invalido");	// caso o valor de opção diferente de 1 até 5
            		break;
            	}	
			}catch(Exception e) {
				menu.botCancel();				// Caso ache uma Exceção
			}
        }
    }
}
