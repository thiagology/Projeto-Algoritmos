/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoreats.negocio.beans;

/**
 *
 * @author Rayan
 */
public class Endereco {
    private String bairro;
    private String rua;
    private int numero;
    
	public Endereco(String bairro, String rua, int numero) {
		super();
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Endereço: \nBairro: " + bairro + ", rua: " + rua + ", numero: " + numero + ".";
	}
    
	
    
}
