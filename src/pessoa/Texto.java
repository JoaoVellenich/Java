package pessoa;

public class Texto  implements java.io.Serializable{
    // Atributo da classe ou varáveis de instancia
    private String txt;
    Texto(String txt){
        setTxt(txt);
        limparEspacosExcedentes();
    }

    // setters e getters
    public void setTxt(String t){
        this.txt = t;
    }

    public String getTxt(){
        return this.txt;
    }

    public String inverterTexto(){
        String txtInvertido = "";
        if(!(this.txt == null || this.txt.equals("") )){
            for (int i=this.txt.length()-1; i >= 0; i--){
                txtInvertido = txtInvertido + this.txt.charAt(i);
            }
        } else {
            return null;
        }
        return txtInvertido;
    }

    public int getQtdePalavras(){
        return (getTxt().split(" ").length);
    }

    private void limparEspacosExcedentes(){
        // Elimina espacos do inicio e fim da string
        setTxt(this.txt.trim());

        // Elimina espacos excedentes do meio da string
        String s = "";
        for (int i=0; i < this.txt.length(); i++){
            s = s + this.txt.charAt(i);
            if(this.txt.charAt(i) == ' '){
                while(this.txt.charAt(i+1) == ' '){
                    i++;
                }
            }
        }
        setTxt(s);
    }

    public String toString(){
        return(getTxt());	// Retorna o s nomes como String
    }
}
