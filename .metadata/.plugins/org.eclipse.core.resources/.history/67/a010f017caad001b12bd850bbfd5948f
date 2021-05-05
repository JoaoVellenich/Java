package Save_Data;

import java.io.*;
import javax.swing.*;

import pessoa.Aluno;

public class DadosIn {
    
    private File file = null;
    private String arquivo = null;
    private final char separador = '|';
    String sn = "S";

    public DadosIn(){
        newFile();
    }
    
    public void newFile(){
        do {
            arquivo = JOptionPane.showInputDialog("Arquivo: ");
            file = new File(arquivo);
            if (file.exists()) {
                sn = JOptionPane.showInputDialog("Arquivo: " + arquivo + " ja existe, pode sobrescreve-lo?(s/n): ");
            }
        } while(sn.toUpperCase().charAt(0) == 'N');
    }

    public void saveData(Aluno a){
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
            pw.print(a.getNome());
            pw.print(separador);
            pw.print(a.getIdade());
            pw.print(separador);
            pw.print(a.getRa());
            pw.print(separador);
            pw.print(a.getAnoIngresso());
            pw.print(separador);
            pw.println(a.getPeriodo());
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

}
