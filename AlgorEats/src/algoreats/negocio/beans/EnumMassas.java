package algoreats.negocio.beans;

public enum EnumMassas {
	
	LASANHA ("Lasanha"),
	ESPAGUETE ("Espaguete"),
	PANQUECA ("Panqueca"),
	RAVIOLI ("Ravioli"),
	CREPE("Crepe");
	
    private String nome;
    
    EnumMassas (String nome) {
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
