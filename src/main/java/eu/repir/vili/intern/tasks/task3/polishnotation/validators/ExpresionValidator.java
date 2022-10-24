package eu.repir.vili.intern.tasks.task3.polishnotation.validators;

public class ExpresionValidator {

	public boolean validate(String expresion) {

		String element = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789+-*/^";

		boolean buffer = true;
		
		for (char elem : expresion.toCharArray()) {
			for (char symbol : element.toCharArray()) {
				if (elem != symbol) {
					buffer = false;
					break;
				}
			}
			if (!buffer) {
				break;
			}
		}
		return buffer;
	}
}