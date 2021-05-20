package model;

/**
 * Classe para armazenar os atributos e métodos do objeto Livro
 * 
 * @author Diego Munhoz
 * @since 18/02/2021
 */
public class Livro {

	// Contrutor da classe
	public Livro() {
	}

	// Declarando os atributos
	private int codigo;
	private String titulo;
	private Editora editora;
	private Autor autor;
	private int anoPublicacao;

	// Método para acessar os atributos
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

}
