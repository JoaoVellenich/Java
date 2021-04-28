package pessoa;

public class NomePessoa {
    // atributos
    private Texto nome;
    
    /**
     * Construtor para objetos da classe NomePessoa
     */
    public NomePessoa(String nome){
        this.nome = new Texto(nome);
    }
    
    // setters e getters
    public void setNome(String nome){
        this.nome.setTxt(nome);
    }
    
    public Texto getNome(){
        return (this.nome);
    }
   
    /**
     * Retorna nome bibliografico
     * @return sBib nome bibliografico
     */
    public String getNomeBibliografico(){
        // Separa as palavras do nome
        String vts[] = getNome().getTxt().split(" ");
        int qtdPal = vts.length; // qtde de palavras
        
        // Monta ultimo nome com a virgula e espaco
        String nomeBib = vts[qtdPal - 1] + ", ";
        
        // Monta o restante
        for (int i = 0; i < (qtdPal-1); i++){
            String pal = vts[i].toLowerCase(); // pega palavra
            if(!ePreposicao(pal)){ // Se nao for preposicao concatena
                nomeBib = nomeBib + vts[i].toUpperCase().charAt(0) + ". ";
            }
        }
        
        return (nomeBib);
    }
   /**
     * Verifica se string eh uma "preposicao"
     * @param s string a ser verificada
     * @return true eh preposicao false nao eh preposicao
     */
    private boolean ePreposicao(String s){
        // Vetor de "preposicoes"
        final String prep[]={"da", "de", "do", "di", "das", "dos", "e",};
        
        for (int i = 0; i < prep.length; i++){
            if(prep[i].equals(s)){
                    return true;
            }
        }
        return false;
    }
 }
