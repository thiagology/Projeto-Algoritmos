package algoreats.negocio.beans;

public class Prato {
	
	private String nomePrato;
	private double preço;
	
	public Prato(String nomePrato, double preço) {
		super();
		this.nomePrato = nomePrato;
		this.preço = preço;
	}
	
	public String getNomePrato() {
		return nomePrato;
	}
	public void setNomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}

	
	@Override
	public String toString() {
		return nomePrato + ", preço: R$" + preço;
	}
	
}
