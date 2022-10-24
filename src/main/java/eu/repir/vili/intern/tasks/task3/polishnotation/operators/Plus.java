package eu.repir.vili.intern.tasks.task3.polishnotation.operators;

public class Plus extends BinaryOperator {

	public Plus() {

	}

	@Override
	public Integer getData() {
		Integer result = super.getLeftNode().getData() + super.getRightNode().getData();
		return result;
	}
}
