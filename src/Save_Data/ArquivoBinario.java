package Save_Data;

import java.io.*;
public class ArquivoBinario{
    public void gravarObjeto(Object[] objeto, String nomeArq){
        ObjectOutputStream output = null;
        
        try {
            File file = new File(nomeArq);
            output = new ObjectOutputStream(new FileOutputStream(file));
            output.writeObject(objeto);
        } catch(Exception e){
            System.out.println(e.toString());
        } finally {
            try {
                output.close();
            } catch(Exception ex) {
                
            }
        }
    }
    
    public Object[] lerObjeto(String nomeArq){
        Object objeto[] = null;
        ObjectInputStream input = null;
        try {
            File file = new File(nomeArq);
            input = new ObjectInputStream(new FileInputStream(file));
            objeto = (Object[])input.readObject();
        }
        catch(Exception e){
            System.out.println(e.toString());
        } finally {
            try {
                input.close();
            } catch(Exception ex) {
                
            }
        }
        return objeto;
    }
    
    public boolean arquivoExiste(){
        boolean existe = false;
        
        File file = null;
        String arquivo = null;
        
        arquivo = "dados.dat";
        file = new File(arquivo);
        if (file.exists()) {
            existe = true;
        }
        return existe;
    }
}
