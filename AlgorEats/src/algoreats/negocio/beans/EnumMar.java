package algoreats.negocio.beans;

public enum EnumMar {
	
	PEIXE ("Peixe"),
	CAMARAO ("Camar�o"),
	LAGOSTA ("Lagosta"),
	LULA ("Lula"),
	SUSHI("Sushi"),
        OSTRA("Ostra");
	
    private String nome;
    
    EnumMar (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString() {
        return this.nome;
    }
}
