package eu.repir.vili.intern.tasks.task3.polishnotation.operators;

import eu.repir.vili.intern.tasks.task3.polishnotation.Node;

/**
 * 
 * @author  Binary operator
 *
 */
public abstract class BinaryOperator implements Node {
	
	private Node leftNode;
	private Node rightNode;

	
	protected BinaryOperator() {
		
	}
	
	protected  Node getLeftNode() {
		return leftNode;
	}
	
	protected  Node getRightNode() {
		return rightNode;
	}

	public void addOperands(Node leftNode, Node rightNode) {
		this.leftNode = leftNode;
		this.rightNode = rightNode;
		
	}
}
