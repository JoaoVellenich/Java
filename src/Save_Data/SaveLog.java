package Save_Data;

import java.io.*;

import armazenador.IArmazenador;
import armazenador.VetDin;

public class SaveLog {
	
	private File file = null;
	private final String arquivo = "LOG.txt";
	IArmazenador IA = new VetDin();
	
	public SaveLog() {
		newFile();
	}
	
	 public void newFile(){
	    	file = new File(arquivo);
	 }
	
	 public void saveData(Object vet1[]){
	        PrintWriter pw = null;
	        FileOutputStream fos = null;

	        try {
	            fos = new FileOutputStream(file);
	            pw = new PrintWriter(fos);
	        } catch(IOException ex) {
	        	System.out.println("Nao conseguiu abrir o arquivo: " + arquivo);
	        	IA.inserir("Nao conseguiu abrir o arquivo: " + arquivo);
	            return;
	        } catch(Exception ex) {
	            System.out.println("Erro inesperado ao tentar abrir o arquivo: " + arquivo);
	            IA.inserir("Erro inesperado ao tentar abrir o arquivo: " + arquivo);
	            return;
	        }
	        
	        try {
	        	for(int i = 0; i < vet1.length; i ++) {
	        		String str = (String)vet1[i];
	        		textOut(pw, str);
	        	}
	        } catch (Exception e) {
	            //IA_LOG.inserir("Erro inesperado ao tentar escrever no arquivo: " + arquivo);
	            return;
	        }finally {
	            try {
	                pw.close();
	            } catch(Exception ex) {
	                // Nao faz nada!
	            }
	            try {
	                fos.close();
	            } catch(Exception ex) {
	                // Nao faz nada!
	            }
	        }
	        
	        IA.inserir("TSDofjaso");
	    }
	    
	    private void textOut(PrintWriter pw, String str){
	    	pw.println(str);
	    }

	    public IArmazenador getIA() {
	    	return IA;
	    }
}
