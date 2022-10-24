package eu.repir.vili.intern.tasks.task3.polishnotation.operators;

import eu.repir.vili.intern.tasks.task3.polishnotation.Node;

public class Minus extends BinaryOperator {

	public Minus() {

	}

	@Override
	public Integer getData() {
		Integer result = super.getLeftNode().getData() - super.getRightNode().getData();
		return result;
	}
}
