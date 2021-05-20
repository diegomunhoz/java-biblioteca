package model;

/**
 * Classe para armazenar os atributos e métodos do objeto Autor
 * 
 * @author Diego Munhoz
 * @since 18/02/2021
 */
public class Autor {

	// Construtor da classe
	public Autor() {
	}

	// declarando os atributos
	private int codigo;
	private String nome;
	private String nacionalidade;

	// Métodos para acessar os atributos
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

}
