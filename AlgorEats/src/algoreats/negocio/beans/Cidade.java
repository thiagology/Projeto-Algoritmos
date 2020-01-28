package algoreats.negocio.beans;

public class Cidade {
	//*********ALGORITMO DO CAIXEIRO VIAJANTE GENÉRICO, FALTA ADAPTAÇÃO PRO PROJETO*********
	
	
	//coordenadas da cidade
	private int cidadeX;
	private int cidadeY;
	
	public Cidade() {
		//Inicializa o local da cidade com um valor aleatorio
		cidadeX = (int) (Math.random() * 50);
		cidadeY = (int) (Math.random() * 50);
	}
	
	public double distanciaParaCidade(Cidade cidade) {
		  //pega o valor da diferença entre os pontos das duas cidades
		  int x = Math.abs(getCidadeX() - cidade.getCidadeX()); 
	      int y = Math.abs(getCidadeY() - cidade.getCidadeY());
	     
	    //retorna a distancia entre os dois pontos   
	   return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); 
	}

	public int getCidadeX() {
		return cidadeX;
	}

	public void setCidadeX(int cidadeX) {
		this.cidadeX = cidadeX;
	}

	public int getCidadeY() {
		return cidadeY;
	}

	public void setCidadeY(int cidadeY) {
		this.cidadeY = cidadeY;
	}
	
	
}
