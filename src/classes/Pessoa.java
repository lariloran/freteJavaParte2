package classes;

public abstract class Pessoa {
	private String nome;

	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
