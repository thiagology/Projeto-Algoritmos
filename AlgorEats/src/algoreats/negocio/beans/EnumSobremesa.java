package algoreats.negocio.beans;

public enum EnumSobremesa {
	
	BOLO ("Bolo"),
	SORVETE ("Sorvete"),
	TORTA ("Torta"),
	PUDIM ("Pudim"),
	PAVE("Pav�"),
        MOUSSE ("Mousse");
	
    private String nome;
    
    EnumSobremesa (String nome) {
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
