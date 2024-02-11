package Trabalho_final_prog1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

// Classe para gravar e ler informações em arquivo de texto
public class Arquivo {
	private BufferedReader br;
	private BufferedWriter bw;
	private String nomeArquivo;
	
	public Arquivo(String nomeArquivo){
		this.nomeArquivo = nomeArquivo;
		if(!this.nomeArquivo.endsWith(".txt")) {
			this.nomeArquivo += ".txt";
		}
	}
	
	public void gravar(String texto){
		try{
			bw = new BufferedWriter(new FileWriter(this.nomeArquivo, true));
			bw.write(texto);
			bw.write("\n");
			bw.close();
		}catch (Exception e) {
			System.out.println("Erro na abertura de arquivo para gravação.");
		}
	}
	
	public String ler(){
		String conteudo = "";
		String texto = "";
		try{
			br = new BufferedReader(new FileReader(this.nomeArquivo));
			while((conteudo = br.readLine()) != null){
				texto = texto + conteudo + "\n";
			}
			br.close();			
		}catch (Exception e) {
			texto += " \n ";
		}
		return texto;
	}
}



