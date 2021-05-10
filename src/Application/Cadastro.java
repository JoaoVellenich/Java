package Application;

import armazenador.*;
import pessoa.Aluno;
import entrada.Menu;
import Save_Data.DadosIn;
import Save_Data.ArquivoBinario;

public class Cadastro implements java.io.Serializable{
    
    Menu menu = new Menu();                 //Instancia o Menu
    ArquivoBinario ab = new ArquivoBinario();
    IArmazenador IA;                        // Instancia a interface do armazenador 				//Instancia o Menu
	int alunoRemovido;
    //Construtor
    public Cadastro() {
        this.IA = new VetDin();             // Construtor da classe Cadastro, Inicia o armazenador
    }
    
    // inserir
    public void inserir (Aluno a){					
    	IA.inserir(a);						// Adiciona o Aluno no vetor do armazenador 
    }
    
    // remover
    public boolean removerAluno (){
        boolean remov = false;              // Booleano remover, retorno da fun��o
        int pos = buscarRA();               // Busca o RA que ser� removido 
        if(pos != -1) {                     // Se o RA for diferente de -1, removera o aluno
            IA.remover(pos);                // Chama a fun��o de remover do armazenador
            remov = true;                   // Se remover retorna true
        }
        return remov;                       // Retorno da fun��o
    }
    
    //Buscar
    private int buscarRA() {                
        int pos = -1;                       // Inicia a pos com um fantasma = -1, por padr�o
        Object vet[] = ((VetDin)this.IA).getVetor();    // Cria um vetor de objetos e recebe os valores da clsse armazenador
        if(vet != null) {                   // Verifica se o vetor nao � nulo
            String ra = menu.removerAluno();// Recebe o RA que deve ser removido 
            for(int i = 0; i < vet.length; i++) {       // Percorre toda a estens�o do vetor
                Aluno a = (Aluno)vet[i];    // Converte a posi��o i do vetor em aluno
                if(a.getRa().equals(ra)) {  // Verifica se o valor recebido do ra � igual o ra do aluno cadastrado
                    pos = i;                // se for igual pos recebe o valor de i
                    break;                  // Interompe o loop assim que achar
                }
            }
        }
        return pos;                         // Retorna a pos
    }
    
    // listar
    public void listarAlunos() {
        Object vet[] = ((VetDin)this.IA).getVetor();    // Cria um vetor de objetos e recebe os valores da clsse armazenador
        if(vet != null) {                   // Verifica se o vetor nao � nulo
            for(int i = 0; i < vet.length; i ++) {      // Percorre toda a estens�o do vetor
                Aluno a = (Aluno)vet[i];    // Converte a posi��o i do vetor em aluno
                menu.listarAlunos(a);       // Manda para a func=��o listarAluno na classe menu, o valor do aluno a ser listado
            }
        }else {
            menu.MSG("Lista Vazia");        // Caso a lista seja vazia, mostra a msg
        }
    }

    public void salvarDados(){
        DadosIn save = new DadosIn();
        Object vet[] = ((VetDin)this.IA).getVetor();
        save.saveData(vet);
        ab.gravarObjeto(vet, "dados.dat");
    }
    
    public void recuperarDados(){     
        if(ab.arquivoExiste()){
            Object vet[] =(Object[])ab.lerObjeto("dados.dat");
            IA.recuperar(vet);
        }
    }
    
	public void cancelBot() {
		menu.botCancel();
	}
	
	public int getAlunoRemovido() {
		return this.alunoRemovido;
	}
 }
