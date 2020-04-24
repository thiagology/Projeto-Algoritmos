package algoreats.negocio.beans;

public class Prato {
	
	private String nomePrato;
	private double pre�o;
	
	public Prato(String nomePrato, double pre�o) {
		super();
		this.nomePrato = nomePrato;
		this.pre�o = pre�o;
	}
	
	public String getNomePrato() {
		return nomePrato;
	}
	public void setNomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

	
	@Override
	public String toString() {
		return nomePrato + ", pre�o: R$" + pre�o;
	}
	
}
