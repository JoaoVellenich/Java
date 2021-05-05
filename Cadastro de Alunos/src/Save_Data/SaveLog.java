package Save_Data;

import java.io.*;
import java.util.Iterator;

import javax.swing.*;

import pessoa.Aluno;

public class SaveLog {
	
	private File file = null;
	private final String arquivo = "LOG.txt";
	private final String titulo = "Arquivo LOG - USUARIO";
	private final String pos = "o - ";
	
	public SaveLog() {
		newFile();
	}
	
	 public void newFile(){
	    	file = new File(arquivo);
	 }
	
	 public void saveData(Object vet[]){
	        PrintWriter pw = null;
	        FileOutputStream fos = null;

	        try {
	            fos = new FileOutputStream(file);
	            pw = new PrintWriter(fos);
	        } catch(IOException ex) {
	            System.out.println("Nao conseguiu abrir o arquivo: " + arquivo);
	            return;
	        } catch(Exception ex) {
	            System.out.println("Erro inesperado ao tentar abrir o arquivo: " + arquivo);
	            return;
	        }
	        
	        try {
	        	pw.println(titulo);
	        	for(int i = 0; i < vet.length; i ++) {
	        		pw.print((i+1) + pos);
	        		String str = (String)vet[i];
	        		textOut(pw, str);
	        	}
	        } catch (Exception e) {
	            System.out.println("Erro inesperado ao tentar escrever no arquivo: " + arquivo);
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
	    }
	    
	    private void textOut(PrintWriter pw, String str){
	    	pw.println(str);
	    }
}
