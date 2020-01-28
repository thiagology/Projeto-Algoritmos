package algoreats.negocio.beans;

public enum EnumFastFood {
	
	HAMBURGUER ("Hambúrguer"),
	PIZZA ("Pizza"),
	BATATA_FRITA ("Batata Frita"),
	CACHORRO_QUENTE ("Cachorro Quente"),
	COXINHA("Coxinha");
	
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
