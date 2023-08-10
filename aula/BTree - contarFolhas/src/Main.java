
public class Main {
	public static void main(String[] args) {

		BTree<Integer> tree = new BTree<>();
		tree.inserir(42);
		tree.inserir(16);
		tree.inserir(35);
		tree.inserir(8);
		tree.inserir(5);
		tree.inserir(11);
		tree.inserir(57);
		tree.inserir(48);


		// System.out.println("Pré Ordem");
		// System.out.println(tree.preOrdem());

		// System.out.println("Em Ordem");
		// System.out.println(tree.emOrdem());

		System.out.println("Pós Ordem");
		System.out.println(tree.posOrdem());
		
		System.out.println(tree.contarFolhas());
	}
}
