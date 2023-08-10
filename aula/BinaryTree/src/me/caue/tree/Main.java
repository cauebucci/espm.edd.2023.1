package me.caue.tree;

public class Main {
	public static void main(String[] args) {
		BTree<String> tree = new BTree<>();
		
		tree.inserir("50");
		tree.inserir("75");
		tree.inserir("90");
		tree.inserir("63");
		tree.inserir("35");
		tree.inserir("23");
		tree.inserir("45");
		
		System.out.println(tree.preOrdem());
		
	}
}
