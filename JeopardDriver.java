package jeopardy;

import java.io.FileNotFoundException;

public class JeopardDriver 
{
	public static void main(String[] args) throws FileNotFoundException {
		Questions main = new Questions();
		main.inputQuestions();
		System.out.println(main);
	}
}
