package model;

public class Rank {
	
	private String nome;
	private int potuacao;
	
	public Rank(String nome, int potuacao) {
		this.nome = nome;
		this.potuacao = potuacao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPotuacao() {
		return potuacao;
	}
	public void setPotuacao(int potuacao) {
		this.potuacao = potuacao;
	}

}
