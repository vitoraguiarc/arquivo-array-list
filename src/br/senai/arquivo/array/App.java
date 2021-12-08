package br.senai.arquivo.array;

import br.senai.arquivo.ui.TelaContato;

public class App {

	public static void main(String[] args) {
		
		// Declaração das variáveis/objetos
		/*Arquivo objArquivo = new Arquivo();
		String caminho = "C:\\Users\\21276756\\Desktop\\Contato\\contatos.txt";
		
		DadosContato objDadosContato = new DadosContato();
		
		Contato objcontato1 = new Contato("Ana", "ana@gmail.com", "1111-2222", "Jandira");
		Contato objcontato2 = new Contato("Maria", "maria@gmail.com", "3333-4444", "Barueri");
		Contato objcontato3 = new Contato("Pedro", "pedro@gmail.com", "5555-6666", "Carapicuiba");
		Contato objcontato4 = new Contato("Lucas", "lucas@gmail.com", "7777-8888", "Itapevi");
		
		objDadosContato.cadastrarContato(objcontato1);
		objDadosContato.cadastrarContato(objcontato2);
		objDadosContato.cadastrarContato(objcontato3);
		objDadosContato.cadastrarContato(objcontato4);
		
		String conteudo = "";
		
		for (Contato c : objDadosContato.listarContatos()) {
			
			conteudo += c.getNome() + ";" + c.getEmail() + ";" + c.getTelefone() + ";" + c.getCidade() + "\n";
		}
		
		//System.out.println(texto);
		
		objArquivo.escrever(caminho, conteudo);*/
		
		TelaContato telinha = new TelaContato();
		telinha.setVisible(true);
		telinha.setResizable(false);
		
		

		

	}

}
