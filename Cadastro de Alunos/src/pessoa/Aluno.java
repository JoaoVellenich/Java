package pessoa;

public class Aluno extends Pessoa {
    // Atributos
    private String ra;
    private int anoIngresso;
    private int periodo;
    private Disciplina disciplinas[];
    
    public Aluno (String nome, int idade, String ra, int anoIng, int periodo){	//Construtor da classe Aluno
        // chama construtor da classe pai
        super(nome, idade); // envia dados para a classe pa (Pessoa)
        this.ra = ra;
        this.anoIngresso = anoIng;
        this.periodo = periodo;
    }
    public String getRa(){
        return this.ra;			// Retorna o RA
    }
    public int getPeriodo(){
        return this.periodo;	// Retorna o Periodo
    }
    public int getAnoIngresso(){
        return this.anoIngresso;// Retorna o ano de ingresso
    }
        
    public String toString(){
        // formata os dados do aluno
        String dados = "\nNome: " + super.getNome() + " | Idade:"+ Integer.toString(super.getIdade())+"\n";
        dados += "RA: " + getRa() + "\n";
        dados += "Ano de Ingresso: "+ Integer.toString(anoIngresso)+" | Periodo: " + Integer.toString(periodo) + "o \n";
        return dados;
    }
}
