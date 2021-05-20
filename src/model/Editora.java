package model;

/**
 * Classe para armazenar os atributos e métodos do objeto Editora
 * 
 * @author Diego Munhoz
 * @since 18/02/2021
 */
public class Editora {

	// Construtor da classe
	public Editora() {
	}

	// declarando os atributos
	private int codigo;
	private String nome;
	private String pais;

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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
