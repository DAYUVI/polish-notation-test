package eu.repir.vili.intern.tasks.task3.polishnotation.operators;

public class Power extends BinaryOperator {

	public Power() {

	}

	@Override
	public Integer getData() {
		Integer result = getLeftNode().getData()*getRightNode().getData();

		return result;
	}
}
