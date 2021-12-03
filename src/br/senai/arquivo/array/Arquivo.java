package br.senai.arquivo.array;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.processing.FilerException;

public class Arquivo {
	
	public boolean escrever(String caminho, String conteudo) {
		
		try {
			
			FileWriter arquivo = new FileWriter(caminho);
			PrintWriter gravarArquivo = new PrintWriter(arquivo);
			
			gravarArquivo.append(conteudo);
			gravarArquivo.close();
			return true;
			
		} catch (IOException e) {
			
			System.out.println("ERRO: " + e.getMessage());
			return false;
		}
	    
	}
	
	//LE DADOS NO ARQUIVO
	public String ler(String caminho) {
		
		String conteudo = "";
		
		//RECUPERA OS DADOS NO ARQUIVO E ARMAZENA EM MEM�RIA PARA A MANIPULA��O
		try {
			
			//ABRE O ARQUIVO
			FileReader arquivo = new FileReader(caminho);
			
			//ARMAZENA O CONTE�DO DO ARQUIVO EM MEM�RIA
			BufferedReader conteudoArquivo = new BufferedReader(arquivo);
			
			//RECUPERA OS DADOS DO ARQUIVO
			try {
			String linha = "";
			linha = conteudoArquivo.readLine();
			while (linha != null) {
				
				// conteudo = conteudo + linha
				conteudo += linha;
				linha = conteudoArquivo.readLine();
				
			}
			
			conteudoArquivo.close();
			return conteudo;
			} catch (IOException e) {
				System.out.println("ERRO: " + e.getMessage());
				return "";
			}
		} catch (FileNotFoundException e) {
			
			System.out.println("ERRO: " + e.getMessage());
			return "";
			
		}
	}

}
