package armazenador;
 

public class VetDin implements IArmazenador {
    // atributos
    private Object vetor[];
    private int qtd;
	
    // construtor
    public VetDin(){
        setVetor(null);
        setQtd(0);
    }

    public Object[] getVetor() {
        return vetor;
    }

    public int getQtd() {
        return qtd;
    }

    /**
     * @param vetor
     */
    public void setVetor(Object[] vetor) {
        this.vetor = vetor;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void inserir(Object obj){
        if (vetor == null){ // se for o primeiro elemento          
            setVetor(new Object[1]);
            vetor[0] = obj; 
            setQtd(getQtd()+1);
        }
        else { // outros elementos
            // cria vetor auxiliar com mais um elemento
            Object aux[] = new Object[vetor.length+1];

            // copia todos elementos de vet para aux
            copiar(vetor, aux);

            // insere elemento novo
            aux[aux.length-1] = obj;

            // Transforma vetor auxiliar no atual
            setVetor(aux);

            // incrementa contador de elementos    
            setQtd(getQtd()+1);

        }
    }

    public void remover (int i) {
        if(vetor != null){
            // Libera elemento da sua posicao
            vetor[i] = null;

            if(getQtd() > 1){
                // cria vetor auxiliar com mes um elemento
                Object aux[] = new Object[vetor.length-1];

                // copia todos elementos de vet para aux
                copiar(vetor, aux);

                // Transforma vetor auxiliar no atual
                setVetor(aux);
                // decrementa contador de elementos    
                setQtd(getQtd() - 1);
            } else {
                // acabou os elementos
                setVetor(null);
                // decrementa contador de elementos    
                setQtd(0);

            }

        }
    }

    Object buscar (int i){
        return vetor[i];
    }

    boolean vazia(){
        return (getQtd()==0 && getVetor() == null);
    }

    private void copiar(Object origem[], Object destino[]){
        // copia todos
        int i, k = 0;
        for (i = 0; i < origem.length; i++){
            if (origem[i] != null) {
                destino[k] = origem[i];
                k++;
            }
        }       
    }

    public String toString(){
        String s = "";
        if(vetor != null){
            for (int i = 0; i < vetor.length; i++){
                s += vetor[i].toString();
            }
        }
        return s;
    }
}
