package eu.repir.vili.intern.tasks.task3.polishnotation;

import eu.repir.vili.intern.tasks.task3.polishnotation.operators.BinaryOperator;
import eu.repir.vili.intern.tasks.task3.polishnotation.operators.Devide;
import eu.repir.vili.intern.tasks.task3.polishnotation.operators.Minus;
import eu.repir.vili.intern.tasks.task3.polishnotation.operators.Multiply;
import eu.repir.vili.intern.tasks.task3.polishnotation.operators.Plus;
import eu.repir.vili.intern.tasks.task3.polishnotation.operators.Power;

public enum OperatorFactory {

	PLUS("+") {
		@Override
		public BinaryOperator create() {
			
			return new Plus();
		}
	},

	MINUS("-") {
		@Override
		public BinaryOperator create() {
			
			return new Minus();
		}
	},

	DIVIDE("/") {
		@Override
		public BinaryOperator create() {
			
			return new Devide();
		}
	},

	MULTIPLY("*") {
		@Override
		public BinaryOperator create() {
			
			return new Multiply();
		}
	},

	POWER("^") {
		@Override
		public BinaryOperator create() {
			
			return new Power();
		}
	};

	private String symbol;

	OperatorFactory(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbol() {
		return symbol;
	}

	public abstract BinaryOperator create();
	
	
	
	public static OperatorFactory findBySymbol(String symbol) {
		
		for (OperatorFactory operator : OperatorFactory.values()) {
			if (operator.getSymbol() == symbol) {
				return operator;
			}
		}
		
		throw new RuntimeException("Not Symbol");
	}
}
