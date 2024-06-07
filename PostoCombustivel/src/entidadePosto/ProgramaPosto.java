package entidadePosto;

public class ProgramaPosto {

	public String veiculo;
	public double vlGasolina;
	public double vlEtanol;
	public int quantidadeGasol;
	public int quantidadeEtan;

	
	public double litrosGasolinaAbastecido() {
		return vlGasolina * quantidadeGasol;
	}
	public double litrosEtanolabastecido() {
		return vlEtanol * quantidadeEtan;
	}

	public String toString() {
		return  "Lucro da gasolina $" 
				+ String.format("%.2f", litrosGasolinaAbastecido())
				+ ", Lucro do etanol $" 
				+ String.format("%.2f", litrosEtanolabastecido())
;


	}
}