
public class MostraLista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Lista listaUm = new Lista();
		listaUm.primeiroNode("Vini");
		listaUm.addTail("Vini 2", listaUm);
		listaUm.addTail("Vini 3", listaUm);
		
		System.out.println(listaUm.getTail());
		System.out.println(listaUm.getTotalDeNodes());
		System.out.println(listaUm.listarTodosNodes(listaUm));
		
		// TODO Auto-generated method stub

	}

}
