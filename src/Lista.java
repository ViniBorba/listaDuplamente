
public class Lista {
	
	private Node head;
	private Node tail;
	private int totalDeNodes;
	
	
	//COnstrutor
	public Lista(){
		this.head = null;
		this.tail = null;
		this.totalDeNodes = 0;
	}
	//colocar elemento no node no início
	/*
	public void primeiroNode(Object elemento){
		Node novo = new Node();
		novo.primeiroElemento(elemento);
		totalDeNodes ++;
	}
	*/
	
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
	
	//metodo para colocar elemento no head o primeiro da fila
	//Criando um balde dentro da fila
	public void addTail(Object elemento){
		//Caso o lista esteja sem baldes, vazia
		if(this.totalDeNodes == 0){
			//Criando um node. Algo pra colocar dentro do balde
			Node novo = new Node();
			
			//To passando o o objeto para o node que criei
			novo.setElemento(elemento);
			
			//To falando pra esse node (novo) que ele está no head, balde cabeça
			this.head = novo;
			
			//To falando pra esse node (novo) que ele está no tail, balde rabo
			this.tail = novo;
			
			//To falando pro node quem é o priximo node e qual é o node anterior, nesse caso é ele mesmo, por isso ele aponta para o noede tail e head
			novo.setAnterior(tail);
			novo.setProximo(head);
		}else{//caso a lista já tenha baldes, elementos
			Node novo2 = new Node();//criando um node novo
			novo2.setElemento(elemento);//passando o objeto para o node novo
			this.head = novo2;//tenho que falar pra esse node que ele está no balde head, no primeiro balde, ele é o novo primeiro balde
			//Eu ainda tenho que falar pro node qual é prixumo balde e qual é o balde atnerior
			novo2.setProximo(null);//falando pro node qual o proximo balde
			
		}
		this.totalDeNodes++;
	}
	
	//listar todos os nodes da lista
	public void mostraLista(){
		if(this.totalDeNodes == 0){
			System.out.println("[]");
		}else {
			Node aux = this.head;
			for(int i = 0; i < this.totalDeNodes -1; i++){
				System.out.print(aux.getElemento()+", ");
				aux = aux.getProximo();
			}
		}
	}

}
