package eu.repir.vili.intern.tasks.task3.polishnotation.operands;

public class ValueOperand extends Operand {
	
	private Integer number;
	
	public ValueOperand(Integer number) {
		this.number = number;
	}
	
	@Override
	public Integer getData() {
		return this.number;
	}

}
