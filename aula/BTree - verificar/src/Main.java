
public class Main {
	public static void main(String[] args) {

		BTree<Integer> bt1 = new BTree<>();
		bt1.inserir(42);
		bt1.inserir(16);
		bt1.inserir(35);
		bt1.inserir(8);
		bt1.inserir(5);
		bt1.inserir(11);
		bt1.inserir(57);
		bt1.inserir(48);
		
		BTree<Integer> bt2 = new BTree<>();
		bt2.inserir(42);
		bt2.inserir(16);
		bt2.inserir(35);
		bt2.inserir(8);
		bt2.inserir(5);
		bt2.inserir(11);
		bt2.inserir(57);
		bt2.inserir(48);


		// System.out.println("Pré Ordem");
		// System.out.println(tree.preOrdem());

		// System.out.println("Em Ordem");
		// System.out.println(tree.emOrdem());

		System.out.println("Pós Ordem");
		System.out.println(bt1.posOrdem());
		
		System.out.println(bt1.verificar(bt2));
	}
}
