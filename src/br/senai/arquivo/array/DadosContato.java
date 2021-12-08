package br.senai.arquivo.array;

import java.util.ArrayList;

public class DadosContato {
	
	// Atributos
	Contato contato = new Contato();
	ArrayList<Contato> contatos = new ArrayList<Contato>();
	
	// M�todos
	public void cadastrarContato(Contato c) {
		contatos.add(c);
	}
	
	public ArrayList<Contato> listarContatos() {
		return contatos;
	}
	
	public int contarContatos() {
		return contatos.size();
	}
	

}
