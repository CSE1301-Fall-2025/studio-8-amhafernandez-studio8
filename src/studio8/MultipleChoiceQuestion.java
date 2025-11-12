package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {
	private String choices[];
	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	public MultipleChoiceQuestion(String newPrompt, String newAnswer, int newPoints, String[] newChoices) {
		super(newPrompt, newAnswer, newPoints);
		choices = newChoices;
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		super.displayPrompt();
		for (int i = 0; i < choices.length; i++) {
			System.out.println(i + ". " + choices[i]);
		}
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return choices;
	}
	
	public static void main(String[] args) {
		String newChoices[] = {"5", "6", "7", "20"};
		MultipleChoiceQuestion mcq1 = new MultipleChoiceQuestion("How many rings will Jayden Daniels get in his career?", "20", 1000, newChoices);
		mcq1.displayPrompt();

		System.out.println(mcq1.checkAnswer("20"));
		System.out.println(mcq1.checkAnswer("6"));
	}

}
