 package eu.repir.vili.intern.tasks.task3.polishnotation.operands;

import eu.repir.vili.intern.tasks.task3.polishnotation.VariableResolver;

public class VariableOperand extends Operand {

	private char variable;
	private VariableResolver resolver;

	public VariableOperand(char variable, VariableResolver resolver) {
		this.variable = variable;
		this.resolver = resolver;
	}

	@Override
	public Integer getData() {
		return resolver.resolve(variable);
	}
}
 