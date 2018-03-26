
public class Node {
	
	private Object proximo;
	private Object anterior;
	private Object elemento;



	public void primeiroElemento (Object novo){
		this.elemento = novo;
		this.proximo = null;
		this.anterior = null;
	}
}