package algoreats.negocio.beans;

public enum EnumFastFood {
	
	HAMBURGUER ("Hamb�rguer"),
	PIZZA ("Pizza"),
	BATATA_FRITA ("Batata Frita"),
	CACHORRO_QUENTE ("Cachorro Quente"),
	COXINHA("Coxinha"),
        PASTEL ("Pastel");
	
    private String nome;
    
    EnumFastFood (String nome) {
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
