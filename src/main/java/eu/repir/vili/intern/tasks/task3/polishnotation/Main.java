package eu.repir.vili.intern.tasks.task3.polishnotation;

import eu.repir.vili.intern.tasks.task3.polishnotation.operands.Operand;
import eu.repir.vili.intern.tasks.task3.polishnotation.operands.ValueOperand;
import eu.repir.vili.intern.tasks.task3.polishnotation.operands.VariableOperand;
import eu.repir.vili.intern.tasks.task3.polishnotation.operators.BinaryOperator;
import eu.repir.vili.intern.tasks.task3.polishnotation.operators.Plus;
import eu.repir.vili.intern.tasks.task3.polishnotation.operators.Power;
import eu.repir.vili.intern.tasks.task3.polishnotation.variableresolvers.UserInputVariableResolver;

public class Main {

	public static void main(String[] args) {

		Plus plus = new Plus();

		String expresion = "/ ^ + 3 5 7";
		String[] allOperators = new String[] { "+", "-", "*", "/", "^" };
		int countSymbolOp = 0;
		int countNumberAndLetterOperand = 0;

		String[] splitExpresion = expresion.split(" ");
		int lenghtOfSplitExpresion = splitExpresion.length;

		for (String element : splitExpresion) {
			for (String operatorSymbol : allOperators) {
				if (element == operatorSymbol) {
					countSymbolOp++;
				} else {
					countNumberAndLetterOperand++;
				}
			}
		}
		VariableResolver variableResolver = new UserInputVariableResolver(); // variableResolver for user input variable
		Node[] expressionElementNodes = new Node[lenghtOfSplitExpresion];

		for (int i = 0; i < lenghtOfSplitExpresion; i++) {
			String expresionSymbol = splitExpresion[i];
			for (String operatorSymbol : allOperators) {
				
				if (expresionSymbol.equals(operatorSymbol)) {
					OperatorFactory operatorFactory = OperatorFactory.findBySymbol(expresionSymbol); // return item of
																										// Enum
																							// OperatorFactory
					expressionElementNodes[i] = operatorFactory.create(); // populate operator at the same
																			// index like position of symbol in
																			// user expression
				} else if (Character.isAlphabetic(expresionSymbol.codePointAt(0))) { // get codePoint of first element
																						// in String and check if it isAlphabetic
					Operand variable = new VariableOperand(expresionSymbol.charAt(0), variableResolver);
					expressionElementNodes[i] = variable;
				} else if () {
					int parsExpresionSymbol = Integer.parseInt(expresionSymbol); // pars String element which is number
																					// to integer
					Operand value = new ValueOperand(parsExpresionSymbol);
					expressionElementNodes[i] = value;
				}
			}
		}
public static voi
		int index  = findeLastOperatorIndex(expressionElementNodes);
		if (expressionElementNodes[index] instanceof BinaryOperator node) {
			if (!(node instanceof Power)) {
				node.addOperands(expressionElementNodes[index +1], expressionElementNodes[index +2]);
			} else {
				node.addOperands(expressionElementNodes[index + 1], expressionElementNodes[index + 1]);
			}
		
	for (int i = 0; i < expressionElementNodes.length; i++) {
		
			if (expressionElementNodes[i] instanceof BinaryOperator node) {
				if (!(node instanceof Power)) {
					node.addOperands(expressionElementNodes[countSymbolOp + 1], expressionElementNodes[countSymbolOp + 2]);
					countSymbolOp -= 2;
				} else {
					node.addOperands(expressionElementNodes[countSymbolOp + 1], expressionElementNodes[countSymbolOp + 1]);
					countSymbolOp--;
				}
			}
		}
		
	    System.out.println(expressionElementNodes[0].getData());
	}

	public static int findeLastOperatorIndex(Node[] expresionElem) {
		int LastOperatorInExpresion = 0;
		for (int i = 0; i < expresionElem.length-1; i++) {
			if (expresionElem[i] instanceof BinaryOperator node) {
				LastOperatorInExpresion = i;
			}

		}
		return LastOperatorInExpresion;
	}

}