package pessoa;

public class Pessoa implements java.io.Serializable{
    // atributos
    private NomePessoa nome;
	private int idade;
    
    //Construtor
    public Pessoa (String nome, int idade){
        this.nome = new NomePessoa(nome);
        this.idade = idade;
    }
    
	public String getNome() {
    	return nome.getNome().getTxt();
    }
    public int getIdade() {
    	return this.idade;
    }
}
