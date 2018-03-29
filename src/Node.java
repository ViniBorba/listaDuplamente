
public class Node {
	
	private Object elemento;
	private Node proximo;
	private Node anterior;



	/*public void primeiroElemento (Node novo){
		this.elemento = novo;
		this.proximo = novo;
		this.anterior = novo;
	}
	*/
// -------------------------	
	public Object getElemento(){
		return this.elemento;
	}
	public void setElemento(Object elemento){
		this.elemento = elemento;
	}
// --------------------------
	public Node getProximo(){
		return this.proximo;
	}
	public void setProximo(Node proximo){
		this.proximo = proximo;
	}
// ---------------------------
	public Node getAnterior(){
		return this.anterior;
	}
	public void setAnterior(Node anterior){
		this.anterior = anterior;
	}
// --------------------------
}