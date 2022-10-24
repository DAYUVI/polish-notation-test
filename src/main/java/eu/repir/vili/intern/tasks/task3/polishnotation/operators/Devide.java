package eu.repir.vili.intern.tasks.task3.polishnotation.operators;

public class Devide extends BinaryOperator {

	public Devide() {
	}

	@Override
	public Integer getData() {
		Integer result = super.getLeftNode().getData() / super.getRightNode().getData();
		return result;
	}
}
