package negocio;

public class Contas {
	private int numero;
	private String nome;
	private float corrente;
	private float poupanca;
	
	Contas(){
		
	}
	
	Contas(int  numero, String nome, float corrente, float poupanca) {
        this.numero = numero;
        this.nome = nome;
        this.corrente = corrente;
        this.poupanca = poupanca;
    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getCorrente() {
		return corrente;
	}

	public void setCorrente(float corrente) {
		this.corrente = corrente;
	}

	public float getPoupanca() {
		return poupanca;
	}

	public void setPoupanca(float poupanca) {
		this.poupanca = poupanca;
	}
}

