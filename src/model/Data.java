package model;

/**
 * Classe para armazenar os atributos e métodos do objeto Data
 * 
 * @author Diego Munhoz
 * @since 18/02/2021
 */
public class Data {

	// declarando os atributos
	private int dia;
	private int mes;
	private int ano;

	// métodos para acessar os atributos
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

}
