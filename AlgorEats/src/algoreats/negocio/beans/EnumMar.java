package algoreats.negocio.beans;

public enum EnumMar {
	
	PEIXE ("Peixe"),
	CAMARAO ("Camarão"),
	LAGOSTA ("Lagosta"),
	LULA ("Lula"),
	SUSHI("Sushi");
	
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
