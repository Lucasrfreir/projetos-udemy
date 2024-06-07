package entidade;

public class Aplicacao {
	
	private int cpf;
	private String titular;
	private double balanco;
	
	public Aplicacao(int cpf, String titular) {
		this.cpf = cpf;
		this.titular = titular;
	}

	public Aplicacao(int cpf, String titular, double depositoInicial) {
		this.cpf = cpf;
		this.titular = titular;
		deposito(depositoInicial);
	}

	public int getNumero() {
		return cpf;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getBalanco() {
		return balanco;
	}

	public void deposito(double quantia){
		balanco += quantia;
	}
	
	public void saque(double quantia) {
		balanco -= quantia + 5.0;		
	}
	
	public String toString() {
		return "CPF "
				+ cpf
				+ ", Titilar: "
				+ titular
				+ ", Balanço: $ "
				+ String.format("%.2f", balanco);
	}
	
}
