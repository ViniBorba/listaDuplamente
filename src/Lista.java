
public class Lista {
	
	private Node head;
	private Node tail;
	private int totalDeNodes;
		
	//colocar elemento no node no início
	public void primeiroNode(Object elemento){
		Node novo = new Node();
		novo.primeiroElemento(elemento);
		totalDeNodes ++;
	}
	
	//metodo pra mostrar a quantia de nós criados
	public int getTotalDeNodes(){
		return this.totalDeNodes;
	}
	
	//metodo para mostrar o head
	public Node getHead(){
		return this.head;
	}
	
	//metodo para mostrar tail
	public Node getTail(){
		return this.tail;
	}
	//metodo para colocar tail
	public void setTail(Node novo){
		this.tail = novo;
	}
	
	/*
	public Node toString(){
		return this.tail;
	}
	*/
	
	//metodo para colocar elemento no tail
	public void addTail(Object elemento, Lista lista){
		Node novo = new Node();
		if(lista.getTail() == null){
			lista.setTail(novo);
			
		} else{
			lista.setTail(novo);
		}
		this.totalDeNodes++;
		
	}
	
	//lista todos os nodes da lista
	public Node listarTodosNodes(Lista lista){
		for(int i = 0; i >= this.totalDeNodes; i++){
			return lista.getHead();
		}
		return null;
	}

}
