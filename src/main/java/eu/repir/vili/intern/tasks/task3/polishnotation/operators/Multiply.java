package eu.repir.vili.intern.tasks.task3.polishnotation.operators;

public class Multiply extends BinaryOperator {

	public Multiply() {

	}

	@Override
	public Integer getData() {
		Integer result = super.getLeftNode().getData() * super.getRightNode().getData();
		return result;
	}
}
