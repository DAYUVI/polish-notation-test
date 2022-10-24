package eu.repir.vili.intern.tasks.task3.polishnotation.variableresolvers;

import java.util.Scanner;

import eu.repir.vili.intern.tasks.task3.polishnotation.VariableResolver;

public class UserInputVariableResolver implements VariableResolver { 

	@Override
	public Integer resolve(char variable) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter  value for " + variable + ": ");
		Integer enteredVariable = scanner.nextInt();
		
		return enteredVariable;
	}

}
