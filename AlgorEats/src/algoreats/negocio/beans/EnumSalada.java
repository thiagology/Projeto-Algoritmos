package algoreats.negocio.beans;

public enum EnumSalada {
	
	TRADICIONAL ("Salada Tradicional"),
	VERDE ("Salada Verde"),
	TROPICAL ("Salada Tropical"),
	MAIONESE ("Salada de Maionese"),
	SALPICAO("Salpicão");
	
    private String nome;
    
    EnumSalada (String nome) {
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
